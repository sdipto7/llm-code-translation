
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    index = 0
    n = int(data[index])
    index += 1
    m = int(data[index])
    index += 1
    x = int(data[index])
    index += 1
    
    min_cost = float('inf')
    
    a = []
    for _ in range(n):
        a.append([int(data[index + j]) for j in range(m + 1)])
        index += m + 1
    
    for i in range(1 << n):
        status = [0] * n
        for j in range(n):
            if (1 & (i >> j)) == 1:
                status[j] = 1
        
        res = [0] * (m + 1)
        for j in range(n):
            if status[j] == 1:
                for k in range(m + 1):
                    res[k] += a[j][k]
        
        flag = True
        for j in range(1, m + 1):
            if res[j] < x:
                flag = False
                break
        
        if flag:
            min_cost = min(min_cost, res[0])
    
    if min_cost == float('inf'):
        print(-1)
    else:
        print(min_cost)

if __name__ == "__main__":
    main()

