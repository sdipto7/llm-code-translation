
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    a = list(map(int, sys.stdin.readline().split()))
    
    cumsum = [0] * (n + 1)
    for i in range(n):
        cumsum[i + 1] = cumsum[i] + a[i]
    
    b = []
    max_sum = 0
    for i in range(n):
        for j in range(i, n):
            s = cumsum[j + 1] - cumsum[i]
            b.append(s)
            if s > max_sum:
                max_sum = s
    
    if max_sum == 0:
        mask = 0
    else:
        mask = 1 << (max_sum.bit_length() - 1)
    
    while mask > 0:
        tmp = [e for e in b if (e & mask) != 0]
        if len(tmp) >= k:
            b = tmp
        mask >>= 1
    
    if len(b) < k:
        print(0)
    else:
        ans = -1
        for e in b:
            ans &= e
        print(ans)

if __name__ == "__main__":
    main()

