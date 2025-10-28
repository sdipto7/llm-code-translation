
import sys

def main():
    import sys
    from math import fabs
    from typing import List

    input = sys.stdin.read().split()
    n = int(input[0])
    a = list(map(int, input[1:n+1]))
    r: List[str] = []
    m = 0

    for i in range(1, n):
        if fabs(a[m]) < fabs(a[i]):
            m = i

    for i in range(n):
        if (a[m] >= 0) != (a[i] >= 0):
            r.append(f"{m + 1} {i + 1}")

    if a[m] >= 0:
        for i in range(1, n):
            r.append(f"{i} {i + 1}")
    else:
        for i in range(n, 1, -1):
            r.append(f"{i} {i - 1}")

    print(len(r))
    for line in r:
        print(line)

if __name__ == "__main__":
    main()

