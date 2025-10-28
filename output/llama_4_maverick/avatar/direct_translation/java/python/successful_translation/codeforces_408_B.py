
from collections import Counter

def is_valid(s1, s2):
    map = set(s1)
    for c in s2:
        if c not in map:
            return False
    return True

def main():
    s1 = input().strip()
    s2 = input().strip()
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
                x1 = m1.get(c, 0)
                x2 = m2.get(c, 0)
                x1 = min(x1, x2)
                ans += x1
        print(ans)

if __name__ == "__main__":
    main()

