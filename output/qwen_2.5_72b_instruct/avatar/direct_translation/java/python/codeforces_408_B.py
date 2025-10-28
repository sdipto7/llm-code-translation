
import sys

def main():
    s = sys.stdin.read().split()
    s1 = s[0]
    s2 = s[1]
    if not is_valid(s1, s2):
        print(-1)
    else:
        m1 = {}
        m2 = {}
        for c in s1:
            if c in m1:
                m1[c] += 1
            else:
                m1[c] = 1
        for c in s2:
            if c in m2:
                m2[c] += 1
            else:
                m2[c] = 1
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

def is_valid(s1, s2):
    n1 = len(s1)
    n2 = len(s2)
    map = {}
    for c in s1:
        map[c] = True
    for c in s2:
        if c not in map:
            return False
    return True

if __name__ == "__main__":
    main()

