
def main():
    N, M = map(int, input().split())
    a = [0] * N
    for i in range(M):
        k, *s = map(int, input().split())
        for x in s:
            x -= 1
            a[x] |= (1 << i)
    p = 0
    x = list(map(int, input().split()))
    for i in range(M):
        p |= (x[i] << i)
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

