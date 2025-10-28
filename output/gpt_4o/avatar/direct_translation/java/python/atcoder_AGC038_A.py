
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    H = int(data[0])
    W = int(data[1])
    A = int(data[2])
    B = int(data[3])

    if W < 2 * A or H < 2 * B:
        print(-1)
        return

    result = []
    for i in range(H):
        row = []
        for j in range(W):
            if (i < B and j < A) or (i >= B and j >= A):
                row.append("0")
            else:
                row.append("1")
        result.append("".join(row))
    
    print("\n".join(result))

if __name__ == "__main__":
    main()

