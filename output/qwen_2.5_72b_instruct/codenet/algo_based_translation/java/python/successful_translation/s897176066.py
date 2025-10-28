import sys

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    A = list(map(int, data[1:N+1]))
    
    A.sort()
    
    for j in range(1, N):
        if A[j] == A[j-1]:
            print("NO")
            return
    
    print("YES")

if __name__ == "__main__":
    main()
