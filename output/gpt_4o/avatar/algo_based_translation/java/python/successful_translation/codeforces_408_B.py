
from collections import defaultdict

def isValid(s1, s2):
    n1 = len(s1)
    n2 = len(s2)
    map = {}
    for c in s1:
        map[c] = True
    for c in s2:
        if c not in map:
            return False
    return True

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    s1 = data[0]
    s2 = data[1]
    
    if not isValid(s1, s2):
        print(-1)
        return
    
    m1 = defaultdict(int)
    m2 = defaultdict(int)
    
    for c in s1:
        m1[c] += 1
    
    for c in s2:
        m2[c] += 1
    
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

