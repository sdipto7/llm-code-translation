
n = int(input())
m = int(input())
arr = list(range(1, n + 1))
for _ in range(m):
    a, b = map(int, input().split(','))
    a -= 1
    b -= 1
    arr[a], arr[b] = arr[b], arr[a]
for num in arr:
    print(num)

