
N = int(input())
A = list(map(int, input().split()))
min_val = float('inf')
count = 0
sum_val = 0
for i in range(N):
    if A[i] < 0:
        count += 1
    min_val = min(min_val, abs(A[i]))
    sum_val += abs(A[i])

if count % 2 == 0:
    print(sum_val)
else:
    print(sum_val - min_val * 2)

