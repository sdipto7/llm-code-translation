
n = int(input())
i = 0
k = 0
flag = True
a = [0] * 1000

while k <= n:
    i += k
    while i >= n:
        i -= n
    a[i] += 1
    k += 1

for index in range(n):
    if a[index] == 0:
        flag = False
        break

print("YES" if flag else "NO")

