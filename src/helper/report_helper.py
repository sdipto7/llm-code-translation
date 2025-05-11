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
        report.writelines(f"Accuracy Rate: {get_rate("test_passed", result_map, total_instance_count)}\n")
        report.writelines(f"Runtime Rate: {get_rate("runtime_failed", result_map, total_instance_count)}\n")
        report.writelines(f"Compilation Rate: {get_rate("compile_failed", result_map, total_instance_count)}\n")
        report.writelines(f"Test Failed Rate: {get_rate("test_failed", result_map, total_instance_count)}\n")
        report.writelines(f"Infinite Loop Rate: {get_rate("infinite_loop", result_map, total_instance_count)}\n\n")
        report.writelines("=================================================================================================\n")
        report.writelines(f"Failed Test Files: {result_map.get("test_failed")} \n")
        report.writelines(f"Failed Test Details: {result_map.get("test_failed_details")} \n")
        report.writelines("=================================================================================================\n")
        report.writelines(f"Runtime Error Files: {result_map.get("runtime_failed")} \n")
        report.writelines(f"Runtime Error Details: {result_map.get("runtime_failed_details")} \n")
        report.writelines("=================================================================================================\n")
        report.writelines(f"Compilation Error Files: {result_map.get("compile_failed")} \n")
        report.writelines("=================================================================================================\n")    
        report.writelines(f"Infinite Loop Files: {result_map.get("infinite_loop")} \n")
        report.writelines("=================================================================================================\n")

def generate_error_type_csv_report(csv_report_file_path, result_map, source_lang, target_lang):
    data = []
    for filename in result_map.get("compile_failed"):
        data.append({"source_lang": source_lang, "target_lang": target_lang, "filename": filename, "error_type": "Compilation Error"})

    for filename in result_map.get("runtime_failed"):
        data.append({"source_lang": source_lang, "target_lang": target_lang, "filename": filename, "error_type": "Runtime Error"})    

    for filename in result_map.get("test_failed"):
        data.append({"source_lang": source_lang, "target_lang": target_lang, "filename": filename, "error_type": "Test Failed"})

    for filename in result_map.get("infinite_loop"):
        data.append({"source_lang": source_lang, "target_lang": target_lang, "filename": filename, "error_type": "Infinite Loop"})

    columns = ["source_lang", "target_lang", "filename", "error_type"]
    df = pd.DataFrame(data, columns=columns)
    df.to_csv(csv_report_file_path, index=False)
