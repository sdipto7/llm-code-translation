
from sortedcontainers import SortedDict

def main():
    a = [0] * 5
    r = [0] * 5
    map = SortedDict()

    for i in range(5):
        a[i] = int(input())
        r[i] = a[i] % 10
        if r[i] != 0:
            map[10 - r[i]] = a[i]

    ans = 0
    if len(map) == 0:
        for i in range(5):
            ans += a[i]
    else:
        last = map[list(map.keys())[-1]]
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

