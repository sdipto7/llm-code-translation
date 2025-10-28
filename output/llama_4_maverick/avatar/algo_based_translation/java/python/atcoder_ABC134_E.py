
from sortedcontainers import SortedDict

def main():
    n = int(input())
    map = SortedDict()
    for _ in range(n):
        num = int(input())
        keys = list(map.keys())
        idx = map.bisect_left(num) - 1
        if idx < 0:
            map[num] = map.get(num, 0) + 1
        else:
            key = keys[idx]
            map[key] -= 1
            if map[key] == 0:
                del map[key]
            map[num] = map.get(num, 0) + 1
    ans = sum(map.values())
    print(ans)

if __name__ == "__main__":
    main()

