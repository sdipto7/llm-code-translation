
n = int(input())
levels = int(input())
arr = list(map(int, input().split()))
level2 = int(input())
arr2 = arr + list(map(int, input().split()))
arr3 = list(range(1, n + 1))
count = sum(1 for i in arr3 if i in arr2)
print("I become the guy." if count == n else "Oh, my keyboard!")

