
def main():
    N, M = map(int, input().split())
    a = [0] * N
    for i in range(M):
        k, *s = map(int, input().split())
        for x in s:
            a[x - 1] |= 1 << i
    p = int(''.join(input().split()), 2)
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

