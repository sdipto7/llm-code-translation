
n = int(input())
i = 0
k = 0
a = [0] * 1000
while k <= n:
    i += k
    if i >= n:
        while i >= n:
            i -= n
    a[i] += 1
    k += 1
flag = True
for j in range(n):
    if a[j] == 0:
        flag = False
        break
print("YES" if flag else "NO")

