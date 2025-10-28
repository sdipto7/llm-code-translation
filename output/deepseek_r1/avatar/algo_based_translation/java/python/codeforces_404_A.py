
import sys

data = sys.stdin.read().split()
n = int(data[0])
str_list = data[1:n+1]
arr = [list(s) for s in str_list]

a = arr[0][0]
b = arr[0][1]

if a == b:
    print("NO")
else:
    res = True
    for i in range(n):
        for j in range(n):
            if i == j or i + j == n - 1:
                if arr[i][j] != a:
                    res = False
                    break
            else:
                if arr[i][j] != b:
                    res = False
                    break
    print("YES" if res else "NO")

