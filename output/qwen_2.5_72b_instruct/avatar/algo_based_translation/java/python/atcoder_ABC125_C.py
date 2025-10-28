
import sys

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a

def main():
    import sys
    input = sys.stdin.read().split()
    N = int(input[0])
    A = list(map(int, input[1:N+1]))

    L = [0] * N
    R = [0] * N

    L[0] = A[0]
    for i in range(1, N):
        L[i] = gcd(L[i-1], A[i])

    R[N-1] = A[N-1]
    for i in range(N-2, -1, -1):
        R[i] = gcd(R[i+1], A[i])

    answer = max(L[N-2], R[1])
    for i in range(1, N-1):
        answer = max(answer, gcd(L[i-1], R[i+1]))

    print(answer)

if __name__ == "__main__":
    main()

