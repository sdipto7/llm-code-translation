
n = int(input())
l1 = int(input())
arr = list(map(int, input().split()))
l2 = int(input())
arr2 = list(map(int, input().split()))
arr = arr + arr2
arr3 = list(range(1, n + 1))
count = sum(1 for i in arr3 if i in arr)
print('I become the guy.' if count == n else 'Oh, my keyboard!')

