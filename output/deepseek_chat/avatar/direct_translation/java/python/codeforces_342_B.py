
import sys
from collections import defaultdict

def main():
    reader = sys.stdin.readline
    input_line = reader().split()
    m = int(input_line[1])
    s = int(input_line[2])
    f = int(input_line[3])
    max_t = -1
    map = defaultdict(list)

    for _ in range(m):
        mth_line = reader().split()
        k = int(mth_line[0])
        map[k].append(int(mth_line[1]))
        map[k].append(int(mth_line[2]))
        max_t = max(max_t, k)

    action = []
    M = 'R' if s < f else 'L'
    d = 1 if s < f else -1
    cur = s

    for t in range(1, max_t + 1):
        a = -1
        b = -1
        if t in map:
            a = map[t][0]
            b = map[t][1]
        if t in map and ((cur >= a and cur <= b) or (cur + d >= a and cur + d <= b)):
            action.append('X')
        else:
            action.append(M)
            cur += d
        if cur == f:
            break

    while cur != f:
        action.append(M)
        cur += d

    print(''.join(action))

if __name__ == "__main__":
    main()

