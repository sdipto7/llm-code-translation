
import sys

result = []
while True:
    line = sys.stdin.readline()
    if not line:
        break
    n = int(line.strip())
    if n == 0:
        break
    for i in range(n):
        pass
    array_line = sys.stdin.readline().strip()
    array2 = array_line.split()
    input_list = list(map(int, array2))
    sum_total = sum(input_list)
    avg = sum_total / n
    num = 0
    for val in input_list:
        if val <= avg:
            num += 1
    result.append(num)

for res in result:
    if res == -1:
        print("NONE")
    else:
        print(res)

