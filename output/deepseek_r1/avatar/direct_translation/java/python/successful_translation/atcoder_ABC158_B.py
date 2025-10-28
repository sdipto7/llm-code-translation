
N, A, B = map(int, input().split())
if (1 <= N <= 10**18 and A >= 0 and B >= 0 and (A + B) > 0 and (A + B) <= 10**18):
    if (A + B) <= N:
        k = N // (A + B)
        remainder = N % (A + B)
        if remainder > A:
            print(A * k + A)
        else:
            print(A * k + remainder)
    else:
        print(A if A <= N else N)

