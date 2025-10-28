
import sys

def main():
    H, W, A, B = map(int, sys.stdin.readline().split())
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

