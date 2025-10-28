import sys
input = sys.stdin.read
data = input().split()
n = int(data[0])
f = 0
a = list(map(int, data[1:n+1]))
k = 0
j = 0
i = 0
for k in range(n):
    t = a[k]
    for i in range(n):
        for j in range(n - 1):
            if i != j and t == (a[i] + a[j]):
                f = 1
                break
        if f == 1:
            break
    if f == 1:
        break
if f == 1:
    print(k + 1, j + 1, i + 1)
else:
    print("-1")
