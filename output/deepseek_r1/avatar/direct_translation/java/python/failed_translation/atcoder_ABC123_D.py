
x = list(map(int, input().split()))[:3]
X, Y, Z = x
K = int(input())
a = []
for i in range(3):
    cnt = x[i]
    lst = list(map(int, input().split()))[:cnt]
    lst.sort()
    a.append(lst)

ans = []
for i in range(X):
    for j in range(Y):
        for m in range(Z):
            if (i + 1) * (j + 1) * (m + 1) <= K:
                s = a[0][X - 1 - i] + a[1][Y - 1 - j] + a[2][Z - 1 - m]
                ans.append(s)

ans.sort(reverse=True)
for val in ans[:K]:
    print(val)

