
import sys

a = []
b = []
c = []
d = []
n = 0
m = 0
q = 0
ans = -100

def main():
    global n, m, q, a, b, c, d, ans
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    m = int(data[1])
    q = int(data[2])
    
    a = [0] * q
    b = [0] * q
    c = [0] * q
    d = [0] * q
    
    index = 3
    for i in range(q):
        a[i] = int(data[index]) - 1
        b[i] = int(data[index + 1]) - 1
        c[i] = int(data[index + 2])
        d[i] = int(data[index + 3])
        index += 4
    
    dfs([])
    print(ans)

def dfs(lst):
    global ans
    if len(lst) == n:
        score = 0
        for i in range(q):
            if lst[b[i]] - lst[a[i]] == c[i]:
                score += d[i]
        ans = max(ans, score)
        return
    
    if lst:
        start = lst[-1]
    else:
        start = 1
    
    for num in range(start, m + 1):
        lst.append(num)
        dfs(lst)
        lst.pop()

if __name__ == "__main__":
    main()

