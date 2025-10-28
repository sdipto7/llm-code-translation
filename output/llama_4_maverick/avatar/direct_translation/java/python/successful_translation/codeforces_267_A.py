
import sys
def sub(a, b):
    min_val = min(a, b)
    max_val = max(a, b)
    result = 0
    while min_val > 0:
        result += max_val // min_val
        max_val = max_val % min_val
        min_val, max_val = min(min_val, max_val), max(min_val, max_val)
    return result

n = int(sys.stdin.readline().strip())
for _ in range(n):
    a, b = map(int, sys.stdin.readline().strip().split())
    print(sub(a, b))

