
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(1, n-1):
    triplet = [a[i-1], a[i], a[i+1]]
    if a[i] != min(triplet) and a[i] != max(triplet):
        ans += 1
print(ans)

