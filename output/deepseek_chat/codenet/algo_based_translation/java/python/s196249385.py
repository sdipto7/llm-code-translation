
import sys

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    n = int(data[0])
    k = int(data[1])
    a = list(map(int, data[2:2+n]))
    
    cumsum = [0] * (n + 1)
    for i in range(n):
        cumsum[i + 1] = cumsum[i] + a[i]
    
    b = []
    max_val = 0
    for i in range(n):
        for j in range(i, n):
            sub_sum = cumsum[j + 1] - cumsum[i]
            b.append(sub_sum)
            if sub_sum > max_val:
                max_val = sub_sum
    
    if max_val == 0:
        mask = 0
    else:
        mask = 1 << (max_val.bit_length() - 1)
    
    while mask > 0:
        tmp = []
        for e in b:
            if e & mask:
                tmp.append(e)
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

