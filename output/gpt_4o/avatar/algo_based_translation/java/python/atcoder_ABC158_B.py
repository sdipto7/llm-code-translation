
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    A = int(data[1])
    B = int(data[2])
    
    if 1 <= N <= 10**18 and 0 <= A and 0 <= B and 0 < A + B <= 10**18:
        if A + B <= N:
            k = N // (A + B)
            if N - k * (A + B) > A:
                result = A * k + (N - k * (A + B)) - (N - (k * (A + B) + A))
            else:
                result = A * k + (N - k * (A + B))
        elif A + B > N and A <= N:
            result = A
        else:
            result = N
        print(result)

if __name__ == "__main__":
    main()

