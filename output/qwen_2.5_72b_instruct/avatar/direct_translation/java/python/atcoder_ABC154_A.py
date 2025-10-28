import sys

input = sys.stdin.read
data = input().split()

a = int(data[2])
b = int(data[3])
u = data[4]

print(f"{a-1} {b}" if u == data[0] else f"{a} {b-1}")
