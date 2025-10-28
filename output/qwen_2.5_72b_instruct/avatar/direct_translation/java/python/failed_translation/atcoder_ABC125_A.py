
import sys

input = sys.stdin.read
data = input().split()

sec = int(data[0])
per_num = int(data[1])
max_sec = float(data[2]) + 0.5
ans_num = 0

for i in range(sec, int(max_sec), sec):
    ans_num += per_num

print(ans_num)

