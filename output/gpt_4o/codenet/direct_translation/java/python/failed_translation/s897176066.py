
N = int(input())
A = [int(input()) for _ in range(N)]
A.sort()
for j in range(1, N):
    if A[j] == A[j - 1]:
        print("NO")
        exit(0)
print("YES")

