
def possible(N, A):
    sum_values = 0
    for i in range(N):
        sum_values += A[i]
        
    NS = N * (N + 1) // 2

    if sum_values % NS != 0:
        return False

    K = sum_values // NS

    for i in range(N):
        j = N - 1 if i == 0 else i - 1
        d = K - (A[i] - A[j])

        if d < 0 or d % N != 0:
            return False

    return True

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    A = list(map(int, data[1:N+1]))

    if possible(N, A):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()

