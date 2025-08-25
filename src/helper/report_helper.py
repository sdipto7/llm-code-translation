import pandas as pd

def get_total_instance_count(result_map):
    return sum(len(result_map.get(key)) for key in ["test_passed", "compile_failed", "runtime_failed", "test_failed", "infinite_loop"])

def get_rate(rate_category, result_map, total_instance_count):
    return (len(result_map.get(rate_category)) / total_instance_count) * 100

def generate_test_report(report_file_path, result_map):
    total_instance_count = get_total_instance_count(result_map)

    with open(report_file_path, "w", encoding="utf-8") as report:
        report.writelines(f"Total Instances: {total_instance_count}\n\n")
        report.writelines(f"Total Correct: {len(result_map.get("test_passed"))}\n")
        report.writelines(f"Total Runtime Failed: {len(result_map.get("runtime_failed"))}\n")
        report.writelines(f"Total Compilation Failed: {len(result_map.get("compile_failed"))}\n")
        report.writelines(f"Total Test Failed: {len(result_map.get("test_failed"))}\n")
        report.writelines(f"Total Infinite Loop: {len(result_map.get("infinite_loop"))}\n\n")
        report.writelines(f"Accuracy Rate: {get_rate("test_passed", result_map, total_instance_count):.2f}%\n")
        report.writelines(f"Runtime Rate: {get_rate("runtime_failed", result_map, total_instance_count):.2f}%\n")
        report.writelines(f"Compilation Rate: {get_rate("compile_failed", result_map, total_instance_count):.2f}%\n")
        report.writelines(f"Test Failed Rate: {get_rate("test_failed", result_map, total_instance_count):.2f}%\n")
        report.writelines(f"Infinite Loop Rate: {get_rate("infinite_loop", result_map, total_instance_count):.2f}%\n")

def generate_error_type_csv_report(csv_report_file_path, result_map, source_lang, target_lang):
    data = []

    compile_failed_details = result_map.get("compile_failed_details")
    runtime_failed_details = result_map.get("runtime_failed_details")
    test_failed_details = result_map.get("test_failed_details")

    for filename in result_map.get("compile_failed"):
        error_details = "\n".join(compile_failed_details.get(filename, []))
        data.append({
            "source_lang": source_lang,
            "target_lang": target_lang,
            "filename": filename,
            "error_type": "Compilation Error",
            "error_details": error_details
        })

    for filename in result_map.get("runtime_failed"):
        error_details = "\n".join(runtime_failed_details.get(filename, []))
        data.append({
            "source_lang": source_lang,
            "target_lang": target_lang,
            "filename": filename,
            "error_type": "Runtime Error",
            "error_details": error_details
        })

    for filename in result_map.get("test_failed"):
        error_details = "\n".join(test_failed_details.get(filename, []))
        data.append({
            "source_lang": source_lang,
            "target_lang": target_lang,
            "filename": filename,
            "error_type": "Test Failed",
            "error_details": error_details
        })

    for filename in result_map.get("infinite_loop"):
        error_details = "The program did not terminate within the allowed time limit"
        data.append({
            "source_lang": source_lang,
            "target_lang": target_lang,
            "filename": filename,
            "error_type": "Infinite Loop",
            "error_details": error_details
        })

    columns = ["source_lang", "target_lang", "filename", "error_type", "error_details"]
    df = pd.DataFrame(data, columns=columns)
    df.to_csv(csv_report_file_path, index=False)
