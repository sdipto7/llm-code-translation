
import sys

def atcoder_ABC128_C():
    sc = sys.stdin
    input_data = sc.read().split()
    index = 0
    
    N = int(input_data[index])
    index += 1
    M = int(input_data[index])
    index += 1
    
    a = [0] * N
    
    for _ in range(M):
        k = int(input_data[index])
        index += 1
        for _ in range(k):
            s = int(input_data[index]) - 1
            index += 1
            a[s] = a[s] | (1 << _)
    
    p = 0
    for i in range(M):
        x = int(input_data[index])
        index += 1
        p = p | (x << i)
    
    ans = 0
    for s in range(1 << N):
        t = 0
        for i in range(N):
            if ((s >> i) & 1) == 1:
                t = t ^ a[i]
        if p == t:
            ans += 1
    
    print(ans)

if __name__ == "__main__":
    atcoder_ABC128_C()

