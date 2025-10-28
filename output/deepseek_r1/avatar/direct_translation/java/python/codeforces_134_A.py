n = int(input())
arr = list(map(int, input().split()))
sum_arr = sum(arr)
count = 0
result = []
for i in range(n):
    x = arr[i]
    if (sum_arr - x) % (n-1) == 0 and (sum_arr - x) // (n-1) == x:
        count += 1
        result.append(str(i+1))
print(count)
print(' '.join(result))
