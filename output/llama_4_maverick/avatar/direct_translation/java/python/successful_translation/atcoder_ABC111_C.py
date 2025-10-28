
from collections import defaultdict
import sys

def main():
    input = sys.stdin.readline
    n = int(input())
    v = list(map(int, input().split()))

    vo = defaultdict(int)
    ve = defaultdict(int)
    vt = defaultdict(int)

    for i in range(n):
        vt[v[i]] += 1
        if i % 2 == 0:
            ve[v[i]] += 1
        else:
            vo[v[i]] += 1

    vo = sorted(vo.items(), key=lambda x: x[1], reverse=True)
    ve = sorted(ve.items(), key=lambda x: x[1], reverse=True)
    vt = sorted(vt.items(), key=lambda x: x[1], reverse=True)

    vo += [(0, 0)] * (2 - len(vo))
    ve += [(0, 0)] * (2 - len(ve))

    if vo[0][0] == ve[0][0]:
        ans = min(n - vo[0][1] - ve[1][1], n - vo[1][1] - ve[0][1])
    else:
        ans = n - vo[0][1] - ve[0][1]

    print(ans)

if __name__ == "__main__":
    main()

