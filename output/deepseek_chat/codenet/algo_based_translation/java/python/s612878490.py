import sys

def main():
    data = sys.stdin.read().splitlines()
    first_line = data[0]
    parts = first_line.split()
    N = int(parts[0])
    M = int(parts[1])
    
    shortage = []
    for i in range(1, M + 1):
        line = data[i]
        parts = line.split()
        A = int(parts[0])
        if N > A:
            shortage.append(N - A)
        else:
            shortage.append(0)
            
    shortage.sort()
    ans = 0
    for i in range(M - 1):
        ans += shortage[i]
        
    print(ans)

if __name__ == "__main__":
    main()
