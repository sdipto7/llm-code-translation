
n = int(input())
a = list(map(int, input().split()))
a.sort()
total = 0
count = 0
for i in range(n-1):
    total += a[i]
    if a[i+1] <= 2 * total:
        count += 1
    else:
        count = 0
print(count + 1)

