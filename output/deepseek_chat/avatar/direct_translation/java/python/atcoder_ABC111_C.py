
import sys
from collections import defaultdict

def main():
    n = int(sys.stdin.readline())
    v = list(map(int, sys.stdin.readline().split()))
    vo = defaultdict(int)
    ve = defaultdict(int)
    vt = defaultdict(int)
    for i in range(n):
        vt[v[i]] += 1
        if i % 2 == 0:
            ve[v[i]] += 1
        else:
            vo[v[i]] += 1
    vo_sorted = sorted(vo.values(), reverse=True)
    ve_sorted = sorted(ve.values(), reverse=True)
    vt_sorted = sorted(vt.values(), reverse=True)
    if vo_sorted[0] + ve_sorted[0] == vt_sorted[0]:
        ans = min(n - vo_sorted[0] - ve_sorted[1], n - vo_sorted[1] - ve_sorted[0])
    else:
        ans = n - vo_sorted[0] - ve_sorted[0]
    print(ans)

if __name__ == "__main__":
    main()

