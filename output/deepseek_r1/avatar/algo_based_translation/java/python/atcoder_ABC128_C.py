
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    ptr = 0
    N = data[ptr]
    ptr += 1
    M = data[ptr]
    ptr += 1
    
    a = [0] * N
    
    for i in range(M):
        k = data[ptr]
        ptr += 1
        for j in range(k):
            s = data[ptr] - 1
            ptr += 1
            a[s] |= (1 << i)
    
    p = 0
    for i in range(M):
        x = data[ptr]
        ptr += 1
        p |= x << i
    
    ans = 0
    for s in range(1 << N):
        t = 0
        for i in range(N):
            if (s >> i) & 1:
                t ^= a[i]
        if t == p:
            ans += 1
    
    print(ans)

if __name__ == "__main__":
    main()

