
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    index = 0
    
    n = int(data[index])
    index += 1
    m = int(data[index])
    index += 1
    
    A = []
    for i in range(n):
        row = []
        for j in range(m):
            row.append(int(data[index]))
            index += 1
        A.append(row)
    
    b = []
    for i in range(m):
        b.append(int(data[index]))
        index += 1
    
    for i in range(n):
        c = 0
        for j in range(m):
            c += A[i][j] * b[j]
        print(c)

if __name__ == "__main__":
    main()

