
n = int(input())
arr = list(map(int, input().split()))
sum_arr = sum(arr)
c = 0
result = []

for i in range(n):
    if (sum_arr - arr[i]) % (n - 1) == 0 and (sum_arr - arr[i]) // (n - 1) == arr[i]:
        c += 1
        result.append(str(i + 1))

print(c)
print(" ".join(result))

