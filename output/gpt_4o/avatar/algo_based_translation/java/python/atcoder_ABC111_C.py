
import sys
from collections import Counter

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    v = list(map(int, data[1:n+1]))
    
    vo = Counter()
    ve = Counter()
    vt = Counter(v)
    
    for i in range(n):
        if i % 2 == 0:
            ve[v[i]] += 1
        else:
            vo[v[i]] += 1
    
    ve_common = ve.most_common(2) + [(0, 0), (0, 0)]
    vo_common = vo.most_common(2) + [(0, 0), (0, 0)]

    ve_common = ve_common[:2]
    vo_common = vo_common[:2]

    if ve_common[0][0] == vo_common[0][0]:
        ans = min(n - ve_common[0][1] - vo_common[1][1], n - ve_common[1][1] - vo_common[0][1])
    else:
        ans = n - ve_common[0][1] - vo_common[0][1]

    print(ans)

if __name__ == "__main__":
    main()

