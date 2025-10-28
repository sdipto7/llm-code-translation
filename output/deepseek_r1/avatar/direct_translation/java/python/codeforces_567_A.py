a = int(input())
arr = list(map(int, input().split()))
for i in range(a):
    max_val = max(arr[i] - arr[0], arr[-1] - arr[i])
    if i == 0:
        min_val = arr[1] - arr[0]
    elif i == a - 1:
        min_val = arr[-1] - arr[-2]
    else:
        min_val = min(arr[i] - arr[i-1], arr[i+1] - arr[i])
    print(min_val, max_val)
