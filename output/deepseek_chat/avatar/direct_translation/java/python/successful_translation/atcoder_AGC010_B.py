
def main():
    import sys
    N = int(sys.stdin.readline())
    A = list(map(int, sys.stdin.readline().split()))
    if possible(N, A):
        print("YES")
    else:
        print("NO")

def possible(N, A):
    total = sum(A)
    NS = N * (N + 1) // 2
    if total % NS != 0:
        return False
    K = total // NS
    for i in range(N):
        j = N - 1 if i == 0 else i - 1
        d = K - (A[i] - A[j])
        if d < 0 or d % N != 0:
            return False
    return True

if __name__ == "__main__":
    main()

