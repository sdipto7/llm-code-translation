
def main():
    s = input().strip()
    n = len(s)
    cum = [0] * (n + 1)
    for i in range(1, n):
        if s[i] == s[i-1]:
            cum[i] = cum[i-1] + 1
        else:
            cum[i] = cum[i-1]
    q = int(input())
    for _ in range(q):
        l, r = map(int, input().split())
        r -= 1
        print(cum[r] - cum[l-1])

if __name__ == "__main__":
    main()

