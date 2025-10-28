
import sys
from collections import OrderedDict

def main():
    sc = sys.stdin.read().strip().split()
    a = [int(sc[i]) for i in range(5)]
    r = [0] * 5
    map = OrderedDict()
    
    for i in range(len(a)):
        r[i] = a[i] % 10
        b = 10
        if r[i] != 0:
            b = 10 - r[i]
            map[b] = a[i]
    
    ans = 0
    
    if len(map) == 0:
        for i in range(len(a)):
            ans += a[i]
        print(ans)
        return
    
    last = map[next(reversed(map))]
    idx = 0
    
    for i in range(len(a)):
        if a[i] == last:
            idx = i
    
    for i in range(len(a)):
        if i != idx:
            if a[i] % 10 == 0:
                ans += a[i]
            else:
                ans += a[i] + (10 - r[i])
    
    ans += last
    print(ans)

if __name__ == "__main__":
    main()

