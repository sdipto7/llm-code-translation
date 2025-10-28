
import sys
from collections import Counter

def main():
    import sys
    import heapq

    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    v = list(map(int, data[1:n+1]))

    vo = [0] * 100010
    ve = [0] * 100010
    vt = [0] * 100010

    for i in range(n):
        vt[v[i]] += 1
        if i % 2 == 0:
            ve[v[i]] += 1
        else:
            vo[v[i]] += 1

    vo = [-x for x in vo if x > 0]
    ve = [-x for x in ve if x > 0]
    vt = [-x for x in vt if x > 0]

    heapq.heapify(vo)
    heapq.heapify(ve)
    heapq.heapify(vt)

    vo = [-heapq.heappop(vo) for _ in range(len(vo))]
    ve = [-heapq.heappop(ve) for _ in range(len(ve))]
    vt = [-heapq.heappop(vt) for _ in range(len(vt))]

    if len(vo) < 2:
        vo.append(0)
    if len(ve) < 2:
        ve.append(0)

    if vo[0] + ve[0] == vt[0]:
        ans = min(n - vo[0] - ve[1], n - vo[1] - ve[0])
    else:
        ans = n - vo[0] - ve[0]

    print(ans)

if __name__ == "__main__":
    main()

