
import sys
from collections import OrderedDict

def main():
    a = [0] * 5
    r = [0] * 5
    map = OrderedDict()
    for i in range(5):
        a[i] = int(sys.stdin.readline())
        r[i] = a[i] % 10
        b = 10
        if r[i] != 0:
            b = 10 - r[i]
            map[b] = a[i]
    ans = 0
    if len(map) == 0:
        for num in a:
            ans += num
        print(ans)
        return
    last = map[list(map.keys())[-1]]
    idx = 0
    for i in range(5):
        if a[i] == last:
            idx = i
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

