
import sys

def main():
    import sys
    input = sys.stdin.read().split()
    N = int(input[0])
    M = int(input[1])
    a = [0] * N
    index = 2
    for i in range(M):
        k = int(input[index])
        index += 1
        for j in range(k):
            s = int(input[index]) - 1
            index += 1
            a[s] |= (1 << i)
    p = 0
    for i in range(M):
        x = int(input[index])
        index += 1
        p |= (x << i)
    ans = 0
    for s in range(1 << N):
        t = 0
        for i in range(N):
            if (s >> i) & 1:
                t ^= a[i]
        if p == t:
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()

