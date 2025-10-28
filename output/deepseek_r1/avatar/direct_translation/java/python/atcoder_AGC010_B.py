
def possible(N, A):
    total = sum(A)
    NS = N * (N + 1) // 2
    if total % NS != 0:
        return False
    K = total // NS
    for i in range(N):
        j = (i - 1) % N
        d = K - (A[i] - A[j])
        if d < 0 or d % N != 0:
            return False
    return True

N = int(input())
A = list(map(int, input().split()))
print("YES" if possible(N, A) else "NO")

