
def main():
    N, A, B = map(int, input().split())
    if 1 <= N <= 10**18 and 0 <= A and 0 <= B and 0 < A + B and A + B <= 10**18:
        if A + B <= N:
            k = N // (A + B)
            remainder = N - k * (A + B)
            if remainder > A:
                result = A * k + A
            else:
                result = A * k + remainder
        else:
            if A <= N:
                result = A
            else:
                result = N
        print(result)

if __name__ == "__main__":
    main()

