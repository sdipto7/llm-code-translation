




import sys

def main():
    br = sys.stdin
    pw = sys.stdout
    s = br.readline().strip()
    cum = [0] * (len(s) + 1)
    for i in range(1, len(s)):
        if s[i] == s[i-1]:
            cum[i] = cum[i-1] + 1
        else:
            cum[i] = cum[i-1]
    q = int(br.readline())
    for _ in range(q):
        line = br.readline().strip()
        if not line:
            continue
        l, r = map(int, line.split())
        print(cum[r-1] - cum[l-1])

if __name__ == "__main__":
    main()

