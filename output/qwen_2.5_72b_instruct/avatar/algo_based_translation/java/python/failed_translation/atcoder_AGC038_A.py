
import sys

def main():
    import sys
    import sys
    import sys
    H = int(sys.stdin.readline())
    W = int(sys.stdin.readline())
    A = int(sys.stdin.readline())
    B = int(sys.stdin.readline())
    if W < 2 * A or H < 2 * B:
        print(-1)
        return
    for i in range(H):
        for j in range(W):
            if (i < B and j < A) or (i >= B and j >= A):
                sys.stdout.write("0")
            else:
                sys.stdout.write("1")
        sys.stdout.write("\n")

if __name__ == "__main__":
    main()



import sys

def main():
    import sys
    H = int(sys.stdin.readline().strip())
    W = int(sys.stdin.readline().strip())
    A = int(sys.stdin.readline().strip())
    B = int(sys.stdin.readline().strip())
    if W < 2 * A or H < 2 * B:
        print(-1)
        return
    for i in range(H):
        for j in range(W):
            if (i < B and j < A) or (i >= B and j >= A):
                sys.stdout.write("0")
            else:
                sys.stdout.write("1")
        sys.stdout.write("\n")

if __name__ == "__main__":
    main()



import sys

def main():
    H = int(input().strip())
    W = int(input().strip())
    A = int(input().strip())
    B = int(input().strip())
    if W < 2 * A or H < 2 * B:
        print(-1)
        return
    for i in range(H):
        for j in range(W):
            if (i < B and j < A) or (i >= B and j >= A):
                print("0", end="")
            else:
                print("1", end="")
        print()

if __name__ == "__main__":
    main()

