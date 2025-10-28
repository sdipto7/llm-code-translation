
N, K = map(int, input().split())
S = input().strip()

c1 = list(S)
c3 = list(S)

flag = False
count_op = 0
for i in range(N):
    if flag and c1[i] == 'R':
        flag = False
        count_op += 1
    if count_op == K:
        break
    if c1[i] == 'L':
        c1[i] = 'R'
        flag = True

flag = False
count_op3 = 0
for i in range(N):
    if flag and c3[i] == 'L':
        flag = False
        count_op3 += 1
    if count_op3 == K:
        break
    if c3[i] == 'R':
        c3[i] = 'L'
        flag = True

sum1 = 0
if N > 0:
    bef = c1[0]
    count = 1
    for i in range(1, N):
        if c1[i] == bef:
            count += 1
            if i == N - 1:
                sum1 += count - 1
        else:
            sum1 += count - 1
            count = 1
            bef = c1[i]

sum3 = 0
if N > 0:
    bef = c3[0]
    count = 1
    for i in range(1, N):
        if c3[i] == bef:
            count += 1
            if i == N - 1:
                sum3 += count - 1
        else:
            sum3 += count - 1
            count = 1
            bef = c3[i]

print(max(sum1, sum3))

