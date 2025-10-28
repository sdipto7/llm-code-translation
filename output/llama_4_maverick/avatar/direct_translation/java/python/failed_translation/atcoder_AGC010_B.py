
def possible(N, A):
    sum_val = sum(A)
    NS = N * (N + 1) // 2
    if sum_val % NS != 0:
        return False
    K = sum_val // NS
    for i in range(N):
        j = N - 1 if i == 0 else i - 1
        d = K - (A[i] - A[j])
        if d < 0 or d % N != 0:
            return False
    return True
