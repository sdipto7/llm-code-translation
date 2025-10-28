
import sys
from collections import defaultdict

def main():
    import sys
    input = sys.stdin.read().split()
    m = int(input[1])
    s = int(input[2])
    f = int(input[3])
    maxT = -1
    map = defaultdict(list)
    index = 4
    while m > 0:
        k = int(input[index])
        a = int(input[index + 1])
        b = int(input[index + 2])
        map[k] = [a, b]
        maxT = max(maxT, k)
        index += 3
        m -= 1
    actions = []
    M = 'R' if s < f else 'L'
    d = 1 if s < f else -1
    cur = s
    a = -1
    b = -1
    for t in range(1, maxT + 1):
        if t in map:
            a, b = map[t]
        if t in map and (a <= cur <= b or a <= cur + d <= b):
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

