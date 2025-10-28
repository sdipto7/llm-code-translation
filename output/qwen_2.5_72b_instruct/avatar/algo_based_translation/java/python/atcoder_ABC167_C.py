import sys

def main():
    import sys
    import math

    sc = sys.stdin.read().split()
    n = int(sc[0])
    m = int(sc[1])
    x = int(sc[2])
    min_cost = math.inf
    a = [[0] * (m + 1) for _ in range(n)]

    index = 3
    for i in range(n):
        for j in range(m + 1):
            a[i][j] = int(sc[index])
            index += 1

    for i in range(2 ** n):
        status = [0] * n
        for j in range(n):
            if (1 & i >> j) == 1:
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

    if min_cost == math.inf:
        print(-1)
    else:
        print(min_cost)

if __name__ == "__main__":
    main()
