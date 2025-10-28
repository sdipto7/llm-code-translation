
import sys
from itertools import product

def main():
    sc = sys.stdin
    n, m, x = map(int, sc.readline().split())
    a = [list(map(int, sc.readline().split())) for _ in range(n)]
    min_cost = float('inf')
    
    for i in range(1 << n):
        res = [0] * (m + 1)
        for j in range(n):
            if (1 & i >> j) == 1:
                for k in range(m + 1):
                    res[k] += a[j][k]
        if all(res[j] >= x for j in range(1, m + 1)):
            min_cost = min(min_cost, res[0])
    
    if min_cost == float('inf'):
        print(-1)
    else:
        print(min_cost)

if __name__ == '__main__':
    main()

