
import sys

def main():
    data = sys.stdin.read().split()
    N = int(data[0])
    A = list(map(int, data[1:1+N]))
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

