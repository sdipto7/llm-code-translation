
import sys

def main():
    n, m, x = map(int, sys.stdin.readline().split())
    a = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
    min_cost = float('inf')
    
    for i in range(2 ** n):
        status = [0] * n
        for j in range(n):
            if (i >> j) & 1:
                status[j] = 1
        
        res = [0] * (m + 1)
        for j in range(n):
            if status[j]:
                for k in range(m + 1):
                    res[k] += a[j][k]
        
        valid = True
        for j in range(1, m + 1):
            if res[j] < x:
                valid = False
                break
        
        if valid:
            min_cost = min(min_cost, res[0])
    
    print(-1 if min_cost == float('inf') else min_cost)

if __name__ == "__main__":
    main()

