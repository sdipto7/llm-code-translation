
import sys

def main():
    s = sys.stdin.readline().strip()
    cum = [0] * (len(s) + 1)
    for i in range(1, len(s)):
        if s[i] == s[i - 1]:
            cum[i] = cum[i - 1] + 1
        else:
            cum[i] = cum[i - 1]
    q = int(sys.stdin.readline().strip())
    for _ in range(q):
        l, r = map(int, sys.stdin.readline().strip().split())
        r -= 1
        print(cum[r] - cum[l - 1])

if __name__ == "__main__":
    main()

