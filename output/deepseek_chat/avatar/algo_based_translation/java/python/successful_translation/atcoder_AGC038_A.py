
import sys

def main():
    data = sys.stdin.read().split()
    H = int(data[0])
    W = int(data[1])
    A = int(data[2])
    B = int(data[3])
    
    if W < 2 * A or H < 2 * B:
        print(-1)
        return
        
    for i in range(H):
        row = []
        for j in range(W):
            if (i < B and j < A) or (i >= B and j >= A):
                row.append('0')
            else:
                row.append('1')
        print(''.join(row))

if __name__ == "__main__":
    main()

