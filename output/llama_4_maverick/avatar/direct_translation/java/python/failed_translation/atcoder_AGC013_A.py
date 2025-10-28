
import sys
N = int(sys.stdin.readline())
A = list(map(int, sys.stdin.readline().split()))
count = 0
i = 0
while i < N:
    if i == N - 1:
        count += 1
        break
    elif A[i] == A[i + 1]:
        i += 1
    elif A[i] < A[i + 1]:
        while i < N - 1 and A[i] <= A[i + 1]:
            i += 1
        count += 1
    else:
        while i < N - 1 and A[i] >= A[i + 1]:
            i += 1
        count += 1
print(count)

