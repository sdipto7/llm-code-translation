import pandas as pd

def get_total_instance_count(result_map):
    return sum(len(result_map.get(key)) for key in ["test_passed", "compile_failed", "runtime_failed", "test_failed", "infinite_loop"])

def get_rate(rate_category, result_map, total_instance_count):
    return (len(result_map.get(rate_category)) / total_instance_count) * 100

def generate_test_report(report_file_path, result_map):
    total_instance_count = get_total_instance_count(result_map)

    with open(report_file_path, "w", encoding="utf-8") as report:
        report.writelines(f"Total Instances: {total_instance_count}\n\n")
        
        report.writelines(f"Correct: {len(result_map.get("test_passed"))}\n")
        report.writelines(f"Accuracy: {get_rate("test_passed", result_map, total_instance_count):.2f}%\n\n")

        report.writelines(f"Runtime Failed: {len(result_map.get("runtime_failed"))}\n")
        report.writelines(f"Runtime Fail Rate: {get_rate("runtime_failed", result_map, total_instance_count):.2f}%\n\n")
        
        report.writelines(f"Compilation Failed: {len(result_map.get("compile_failed"))}\n")
        report.writelines(f"Compilation Fail Rate: {get_rate("compile_failed", result_map, total_instance_count):.2f}%\n\n")
        
        report.writelines(f"Test Failed: {len(result_map.get("test_failed"))}\n")
        report.writelines(f"Test Fail Rate: {get_rate("test_failed", result_map, total_instance_count):.2f}%\n\n")

        report.writelines(f"Infinite Loop: {len(result_map.get("infinite_loop"))}\n")
        report.writelines(f"Infinite Loop Rate: {get_rate("infinite_loop", result_map, total_instance_count):.2f}%")

def generate_error_csv_report(report_file_path, filenames, error_details, error_type, source_lang, target_lang, default_msg=None):
    data = []

    for filename in filenames:
        if error_details is None:
            details = default_msg
        else:
            details = "\n".join(error_details.get(filename, []))

        data.append({
            "source_lang": source_lang,
            "target_lang": target_lang,
            "filename": filename,
            "error_type": error_type,
            "error_details": details
        })

        columns = ["source_lang", "target_lang", "filename", "error_type", "error_details"]
        df = pd.DataFrame(data, columns=columns)
        df.to_csv(report_file_path, index=False)
