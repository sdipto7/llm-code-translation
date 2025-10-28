
import sys

input_array = sys.stdin.readline().strip().split()
result = 0
for str_val in input_array:
    result += 1
    if str_val == "0":
        break
print(result)

