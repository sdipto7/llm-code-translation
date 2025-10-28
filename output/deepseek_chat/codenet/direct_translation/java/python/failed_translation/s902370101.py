import sys

n = int(sys.stdin.readline())
array = [int(sys.stdin.readline()) for _ in range(n)]
max_val = max(array)
min_val = min(array)
print(max_val - min_val)
