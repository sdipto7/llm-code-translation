num = int(input())
arr = [input().strip() for _ in range(num)]
fine = 0

for i in range(num):
    cnt = 0
    for k in range(num):
        if arr[k][i] == 'C':
            cnt += 1
    fine += (cnt * (cnt - 1)) // 2

for row in arr:
    cnt = row.count('C')
    fine += (cnt * (cnt - 1)) // 2

print(fine)
