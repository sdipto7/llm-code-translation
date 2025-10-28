
from collections import defaultdict

def main():
    import sys
    input = sys.stdin.read().split()
    N = int(input[0])
    idorder = {}
    index = 1
    for i in range(1, N + 1):
        A = int(input[i])
        idorder[A] = index
        index += 1
    for i in range(1, N + 1):
        print(idorder[i], end=' ')

if __name__ == "__main__":
    main()

