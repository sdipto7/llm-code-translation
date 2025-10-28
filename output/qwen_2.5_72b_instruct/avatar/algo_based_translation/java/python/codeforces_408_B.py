import sys
from collections import Counter, defaultdict

def main():
    import sys
    s = sys.stdin.read().split()
    s1 = s[0]
    s2 = s[1]
    if not is_valid(s1, s2):
        print(-1)
    else:
        m1 = Counter(s1)
        m2 = Counter(s2)
        ans = 0
        hs = set()
        for c in s2:
            if c not in hs:
                hs.add(c)
                x1 = m1[c]
                x2 = m2[c]
                x1 = min(x1, x2)
                ans += x1
        print(ans)

def is_valid(s1, s2):
    map = defaultdict(bool)
    for c in s1:
        map[c] = True
    for c in s2:
        if not map[c]:
            return False
    return True

if __name__ == "__main__":
    main()
