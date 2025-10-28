
import sys

def solve():
    n, k = map(int, sys.stdin.readline().split())
    a = list(map(int, sys.stdin.readline().split()))
    
    cumsum = [0] * (n + 1)
    for i in range(n):
        cumsum[i + 1] = cumsum[i] + a[i]
    
    b = []
    max_val = 0
    for i in range(n):
        for j in range(i, n):
            val = cumsum[j + 1] - cumsum[i]
            b.append(val)
            max_val = max(max_val, val)
    
    mask = 1 << (max_val.bit_length() - 1)
    while mask > 0:
        tmp = [x for x in b if x & mask]
        if len(tmp) >= k:
            b = tmp
        mask >>= 1
    
    if len(b) < k:
        print(0)
    else:
        ans = -1
        for x in b:
            ans &= x
        print(ans)

if __name__ == "__main__":
    solve()

