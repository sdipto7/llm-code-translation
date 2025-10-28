
N, K = map(int, input().split())
S = input()
c1_list = list(S)
c3_list = list(S)
count = 0
flag = False

for i in range(N):
    if flag and c1_list[i] == 'R':
        flag = False
        count += 1
    if count == K:
        break
    if c1_list[i] == 'L':
        flag = True
        c1_list[i] = 'R'

flag = False
count = 0

for i in range(N):
    if flag and c3_list[i] == 'L':
        flag = False
        count += 1
    if count == K:
        break
    if c3_list[i] == 'R':
        flag = True
        c3_list[i] = 'L'

S1 = ''.join(c1_list)
S3 = ''.join(c3_list)
sum1 = 0
count = 1
prev_char = S1[0]

for i in range(1, N):
    if S1[i] == prev_char:
        count += 1
        if i == N - 1:
            sum1 += count - 1
    else:
        prev_char = S1[i]
        sum1 += count - 1
        count = 1

sum3 = 0
count = 1
prev_char = S3[0]

for i in range(1, N):
    if S3[i] == prev_char:
        count += 1
        if i == N - 1:
            sum3 += count - 1
    else:
        prev_char = S3[i]
        sum3 += count - 1
        count = 1

print(max(sum1, sum3))

