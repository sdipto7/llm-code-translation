n = int(input())
arr = list(map(int, input().split()))
arr.sort()
total = 0
for i in range(n):
    total += arr[-2 - 2 * i]
print(total)
