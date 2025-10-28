import sys

def main():
    N = int(input().strip())
    A = []
    for i in range(N):
        A.append(int(input().strip()))
    
    A.sort()
    
    for j in range(1, N):
        if A[j] == A[j-1]:
            print("NO")
            sys.exit(0)
    
    print("YES")

if __name__ == "__main__":
    main()
