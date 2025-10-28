
import sys

def main():
    data = sys.stdin.read().split()
    N = int(data[0])
    A = int(data[1])
    B = int(data[2])
    k = 0
    
    if 1 <= N <= 10**18 and 0 <= A and 0 <= B and 0 < A + B <= 10**18:
        if A + B <= N:
            k = N // (A + B)
            remainder = N - k * (A + B)
            if remainder > A:
                result = A * k + (remainder - (remainder - A))
                print(result)
            else:
                result = A * k + remainder
                print(result)
        elif A + B > N and A <= N:
            print(A)
        else:
            print(N)

if __name__ == "__main__":
    main()

