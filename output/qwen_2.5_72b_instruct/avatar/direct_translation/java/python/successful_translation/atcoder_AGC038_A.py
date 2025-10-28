import sys
input = sys.stdin.read().split()
H = int(input[0])
W = int(input[1])
A = int(input[2])
B = int(input[3])
if W < 2 * A or H < 2 * B:
    print(-1)
else:
    for i in range(H):
        for j in range(W):
            if (i < B and j < A) or (i >= B and j >= A):
                print(0, end='')
            else:
                print(1, end='')
        print()
