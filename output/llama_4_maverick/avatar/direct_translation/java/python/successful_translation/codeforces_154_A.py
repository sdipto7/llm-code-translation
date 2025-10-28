
import sys
arr = sys.stdin.readline().strip()
N = len(arr)
K = int(sys.stdin.readline().strip())
res = 0
for _ in range(K):
    input_str = sys.stdin.readline().strip()
    a, b = 0, 0
    for char in arr:
        if char == input_str[0]:
            a += 1
        elif char == input_str[1]:
            b += 1
        else:
            res += min(a, b)
            a, b = 0, 0
    res += min(a, b)
print(res)

