
def main():
    import sys
    n = int(sys.stdin.readline().strip())
    h = list(map(int, sys.stdin.readline().strip().split()))
    if len(h) != n:
        h = [int(sys.stdin.readline().strip()) for _ in range(n)]

    ans = 0
    out = 0

    for i in range(len(h)):
        if out < h[i]:
            ans += h[i] - out
            out = h[i]
        else:
            out = h[i]

    print(ans)

if __name__ == "__main__":
    main()

