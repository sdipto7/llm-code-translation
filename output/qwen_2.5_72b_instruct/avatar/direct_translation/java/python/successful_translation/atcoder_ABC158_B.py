
import sys

input = sys.stdin.read().split()
N = int(input[0])
A = int(input[1])
B = int(input[2])
k = 0
if 1 <= N <= 10**18 and 0 <= A and 0 <= B and 0 < A + B <= 10**18:
    if A + B <= N:
        k = N // (A + B)
        if N - k * (A + B) > A:
            print(A * k + (N - k * (A + B)) - (N - (k * (A + B) + A)))
        else:
            print(A * k + (N - k * (A + B)))
    elif A + B > N and A <= N:
        print(A)
    else:
        print(N)

