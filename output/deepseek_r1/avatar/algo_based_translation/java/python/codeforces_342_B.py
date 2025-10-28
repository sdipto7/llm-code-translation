
import sys

def main():
    input_line = sys.stdin.readline().split()
    m = int(input_line[1])
    s = int(input_line[2])
    f = int(input_line[3])

    surveillance = {}
    max_t = -1

    for _ in range(m):
        parts = list(map(int, sys.stdin.readline().split()))
        k = parts[0]
        surveillance[k] = (parts[1], parts[2])
        max_t = max(max_t, k)

    actions = []
    M = 'R' if s < f else 'L'
    d = 1 if s < f else -1
    cur = s
    a, b = -1, -1

    for t in range(1, max_t + 1):
        if t in surveillance:
            a, b = surveillance[t]
        
        if t in surveillance and ((a <= cur <= b) or (a <= cur + d <= b)):
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

