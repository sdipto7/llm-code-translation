
s = input().strip()

count1 = 0
arr = list(s)
for i in range(1, len(arr)):
    if arr[i] == arr[i-1]:
        arr[i] = '1' if arr[i] == '0' else '0'
        count1 += 1

count2 = 0
arr2 = list(s)
for i in range(len(arr2)-1, 0, -1):
    if arr2[i] == arr2[i-1]:
        arr2[i-1] = '1' if arr2[i-1] == '0' else '0'
        count2 += 1

print(min(count1, count2))

