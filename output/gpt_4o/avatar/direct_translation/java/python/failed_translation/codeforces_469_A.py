
n = int(input())
levels = int(input())
arr = list(map(int, input().split()))
level2 = int(input())
arr2 = arr + list(map(int, input().split()))
arr3 = list(range(1, n + 1))
count = 0
for i in range(n):
    for x in arr2:
        if arr3[i] == x:
            count += 1
            break
if count == n:
    print("I become the guy.")
else:
    print("Oh, my keyboard!")

