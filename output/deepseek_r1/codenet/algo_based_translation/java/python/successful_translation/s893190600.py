
import sys

def main():
    H, W = map(int, sys.stdin.readline().split())
    if H == 1 and W == 1:
        print("No")
        return
    
    C = [['.'] * (W + 2) for _ in range(H + 2)]
    
    for i in range(1, H + 1):
        line = sys.stdin.readline().strip()
        for j in range(1, W + 1):
            C[i][j] = line[j-1]
    
    for i in range(1, H + 1):
        for j in range(1, W + 1):
            if C[i][j] == '#':
                if (C[i-1][j] != '#' and C[i+1][j] != '#' and
                    C[i][j-1] != '#' and C[i][j+1] != '#'):
                    print("No")
                    return
    
    print("Yes")

if __name__ == "__main__":
    main()

