
import math
N = int(input())
A = int(input())
B = int(input())
if 1 <= N <= 10**18 and 0 <= A <= 10**18 and 0 <= B <= 10**18 and 0 < A + B <= 10**18:
    k = N // (A + B)
    if A + B <= N:
        if N - k * (A + B) > A:
            print(A * k + A + (N - (k * (A + B) + A)))
        else:
            print(A * k + (N - k * (A + B)))
    elif A + B > N and A <= N:
        print(A)
    else:
        print(min(N, A))

