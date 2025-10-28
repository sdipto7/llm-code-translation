
import sys

def main():
    import sys
    import math

    scan = sys.stdin.read().split()
    N = int(scan[0])
    A = int(scan[1])
    B = int(scan[2])
    k = 0

    if 1 <= N <= math.pow(10, 18) and 0 <= A and 0 <= B and 0 < A + B and A + B <= math.pow(10, 18):
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

if __name__ == "__main__":
    main()

