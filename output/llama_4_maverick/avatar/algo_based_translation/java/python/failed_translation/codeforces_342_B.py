
import sys

def main():
    n, m, s, f = map(int, sys.stdin.readline().split())
    maxT = -1
    intervals = {}
    for _ in range(m):
        t, a, b = map(int, sys.stdin.readline().split())
        intervals[t] = (a, b)
        maxT = max(maxT, t)

    actions = []
    M = 'R' if s < f else 'L'
    d = 1 if s < f else -1
    cur = s

    for t in range(1, maxT + 1):
        if t in intervals:
            a, b = intervals[t]
            if (a <= cur <= b) or (a <= cur + d <= b):
                actions.append('X')
            else:
                actions.append(M)
                cur += d
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

