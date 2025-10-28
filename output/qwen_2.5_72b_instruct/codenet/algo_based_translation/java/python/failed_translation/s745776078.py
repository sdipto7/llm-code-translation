
import sys

def main():
    import sys
    from sys import stdin, stdout
    
    in_ = sys.stdin
    out = sys.stdout
    
    n = int(in_.readline().strip())
    m = int(in_.readline().strip())
    A = [[0] * m for _ in range(n)]
    b = [0] * m
    
    for i in range(n):
        for j in range(m):
            A[i][j] = int(in_.readline().strip())
    
    for i in range(m):
        b[i] = int(in_.readline().strip())
    
    for i in range(n):
        c = 0
        for j in range(m):
            c += A[i][j] * b[j]
        out.write(f"{c}\n")
    
    out.flush()

if __name__ == "__main__":
    main()

