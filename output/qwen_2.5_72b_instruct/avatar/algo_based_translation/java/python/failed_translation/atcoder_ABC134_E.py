
from sortedcontainers import SortedDict

def main():
    import sys
    input = sys.stdin.read().split()
    n = int(input[0])
    map = SortedDict()
    index = 1
    for _ in range(n):
        num = int(input[index])
        index += 1
        if not map.irange(maximum=num, reverse=True):
            val = map.get(num, 0)
            map[num] = val + 1
        else:
            key = map.irange(maximum=num, reverse=True)[0]
            val = map[key]
            if val == 1:
                del map[key]
            else:
                map[key] = val - 1
            val = map.get(num, 0)
            map[num] = val + 1
    ans = 0
    for key in map:
        val = map[key]
        ans += val
    print(ans)

if __name__ == "__main__":
    main()

