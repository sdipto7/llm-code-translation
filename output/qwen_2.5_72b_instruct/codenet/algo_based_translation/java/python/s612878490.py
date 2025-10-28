
import sys

def main():
    import sys
    import re
    
    line = sys.stdin.readline().strip()
    N, M = map(int, line.split())
    
    shortage = [0] * M
    
    for i in range(M):
        line = sys.stdin.readline().strip()
        A = int(line.split()[0])
        shortage[i] = N - A if N > A else 0
    
    shortage.sort()
    
    ans = 0
    for i in range(M - 1):
        ans += shortage[i]
    
    print(ans)

if __name__ == "__main__":
    main()

