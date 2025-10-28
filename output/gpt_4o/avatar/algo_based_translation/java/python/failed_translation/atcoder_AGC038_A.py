
import sys

def main():
    sc = sys.stdin
    bw = sys.stdout

    H = int(sc.readline().strip())
    W = int(sc.readline().strip())
    A = int(sc.readline().strip())
    B = int(sc.readline().strip())

    if W < 2 * A or H < 2 * B:
        print(-1, file=bw)
        return

    for i in range(H):
        for j in range(W):
            if (i < B and j < A) or (i >= B and j >= A):
                bw.write("0")
            else:
                bw.write("1")
        bw.write("\n")

if __name__ == "__main__":
    main()

