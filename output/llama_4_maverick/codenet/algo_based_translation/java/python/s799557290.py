
def main():
    import sys
    input = sys.stdin.readline

    a, b = map(int, input().split())
    ju = [False] * 100001
    pe = [0] * 100001
    wa, ac = 0, 0

    for _ in range(b):
        n, res = input().split()
        n = int(n)
        if res.strip() == "WA" and not ju[n-1]:
            pe[n-1] += 1
        if res.strip() == "AC":
            ju[n-1] = True

    for i in range(a):
        if ju[i]:
            ac += 1
            wa += pe[i]

    print(ac, wa)

if __name__ == "__main__":
    main()

