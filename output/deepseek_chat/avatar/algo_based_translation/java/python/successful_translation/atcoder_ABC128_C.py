
import sys

def main():
    data = sys.stdin.read().split()
    index = 0
    
    N = int(data[index]); index += 1
    M = int(data[index]); index += 1
    
    a = [0] * N
    
    for i in range(M):
        k = int(data[index]); index += 1
        for j in range(k):
            s = int(data[index]); index += 1
            s -= 1
            a[s] |= (1 << i)
    
    p = 0
    for i in range(M):
        x = int(data[index]); index += 1
        p |= (x << i)
    
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

