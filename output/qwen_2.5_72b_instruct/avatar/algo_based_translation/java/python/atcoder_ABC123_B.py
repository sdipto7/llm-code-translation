from sys import stdin
from collections import defaultdict

def main():
    import sys
    input = stdin.read().split()
    
    a = [int(input[i]) for i in range(5)]
    r = [a[i] % 10 for i in range(5)]
    map = defaultdict(int)
    
    for i in range(5):
        if r[i] != 0:
            b = 10 - r[i]
            map[b] = a[i]
    
    ans = 0
    if not map:
        for i in range(5):
            ans += a[i]
        print(ans)
        return
    
    last = map[max(map)]
    idx = a.index(last)
    
    for i in range(5):
        if i != idx:
            if a[i] % 10 == 0:
                ans += a[i]
            else:
                ans += a[i] + (10 - r[i])
    
    ans += last
    print(ans)

if __name__ == "__main__":
    main()
