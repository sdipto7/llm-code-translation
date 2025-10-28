
def main():
    import sys
    
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    X = int(data[1])
    
    m = [0] * N
    m[0] = int(data[2])
    X -= m[0]
    min_val = m[0]
    
    for i in range(1, N):
        m[i] = int(data[i + 2])
        X -= m[i]
        if m[i] < min_val:
            min_val = m[i]
    
    result = N + (X // min_val)
    print(result)

if __name__ == "__main__":
    main()

