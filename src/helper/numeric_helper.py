def normalize_integer_output(output, expected_output):
    normalized_output = str(int(float(output.decode())))
    normalized_expected_output = str(int(float(expected_output)))

    return normalized_output, normalized_expected_output

def normalize_decimal_output(output , expected_output):
    output_temp = output.decode().strip()
    output_total_decimal_points = len(output_temp.split(".")[1])

    expected_output_temp = expected_output.strip()
    expected_output_total_decimal_points = len(expected_output_temp.split(".")[1])

    min_decimal_points = min(output_total_decimal_points, expected_output_total_decimal_points)

    normalized_output = str(round(float(output.decode()), min_decimal_points))
    normalized_expected_output = str(round(float(expected_output), min_decimal_points))

    return normalized_output, normalized_expected_output
