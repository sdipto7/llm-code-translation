n = int(input())
a = list(map(int, input().split()))
a.sort()
min_val = a[0]
for num in a:
    if num % min_val != 0:
        print(-1)
        exit()
print(min_val)
