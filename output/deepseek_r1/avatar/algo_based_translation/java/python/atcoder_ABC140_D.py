
n, k = map(int, input().split())
s = input().strip()
c1 = list(s)
c3 = list(s)
flag = False
count = 0

for i in range(n):
    if flag and c1[i] == 'R':
        flag = False
        count += 1
    if count == k:
        break
    if c1[i] == 'L':
        flag = True
        c1[i] = 'R'

flag = False
count = 0

for i in range(n):
    if flag and c3[i] == 'L':
        flag = False
        count += 1
    if count == k:
        break
    if c3[i] == 'R':
        flag = True
        c3[i] = 'L'

s1 = ''.join(c1)
s3 = ''.join(c3)
sum1 = 0
count_sum = 1
bef = s1[0]

for i in range(1, n):
    if s1[i] == bef:
        count_sum += 1
    else:
        sum1 += count_sum - 1
        count_sum = 1
        bef = s1[i]
    if i == n - 1:
        sum1 += count_sum - 1

sum3 = 0
count_sum = 1
bef = s3[0]

for i in range(1, n):
    if s3[i] == bef:
        count_sum += 1
    else:
        sum3 += count_sum - 1
        count_sum = 1
        bef = s3[i]
    if i == n - 1:
        sum3 += count_sum - 1

print(max(sum1, sum3))

