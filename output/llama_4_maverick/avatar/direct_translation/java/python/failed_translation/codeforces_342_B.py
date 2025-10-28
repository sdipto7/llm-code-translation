
import sys
from collections import defaultdict

def main():
    input = sys.stdin.readline
    n, m, s, f = map(int, input().split())
    maxT = -1
    map = defaultdict(list)
    for _ in range(m):
        k, a, b = map(int, input().split())
        map[k].extend([a, b])
        maxT = max(maxT, k)

    actions = []
    M = 'R' if s < f else 'L'
    d = 1 if s < f else -1
    cur = s
    a, b = -1, -1

    for t in range(1, maxT + 1):
        if t in map:
            a, b = map[t]
        if t in map and ((a <= cur <= b) or (a <= cur + d <= b)):
            actions.append('X')
        else:
            actions.append(M)
            cur += d
        if cur == f:
            break

    while cur != f:
        actions.append(M)
        cur += d

    print(''.join(actions))

if __name__ == "__main__":
    main()

