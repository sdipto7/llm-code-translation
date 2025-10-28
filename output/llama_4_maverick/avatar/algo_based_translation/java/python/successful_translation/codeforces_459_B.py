N = int(input())
A = list(map(int, input().split()))
A.sort()
min_val = A[0]
max_val = A[-1]
mins = 0
maxs = 0
for value in A:
    if value == min_val:
        mins += 1
    if value == max_val:
        maxs += 1
if min_val == max_val:
    pairs = mins * (mins - 1) // 2
else:
    pairs = mins * maxs
print(max_val - min_val, pairs)
