
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    N = data[0]
    A = data[1:N+1]
    A.sort()
    for j in range(1, N):
        if A[j] == A[j-1]:
            print("NO")
            return
    print("YES")

if __name__ == "__main__":
    main()

