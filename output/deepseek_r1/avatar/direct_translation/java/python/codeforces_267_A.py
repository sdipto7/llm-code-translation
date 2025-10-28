
def sub(a, b):
    min_val, max_val = min(a, b), max(a, b)
    result = 0
    while min_val > 0:
        result += max_val // min_val
        max_val, min_val = min_val, max_val % min_val
    return result

n = int(input())
for _ in range(n):
    a, b = map(int, input().split())
    print(sub(a, b))

