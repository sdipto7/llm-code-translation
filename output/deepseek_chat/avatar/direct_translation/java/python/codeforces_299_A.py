
n = int(input())
a = [int(input()) for _ in range(n)]
a.sort()
min_val = a[0]
for value in a:
    if value % min_val != 0:
        print(-1)
        exit()
print(min_val)

