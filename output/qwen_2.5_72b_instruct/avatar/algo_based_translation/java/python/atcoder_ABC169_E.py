
import sys
from collections import deque

def main():
    num = 998244353
    input = sys.stdin.read().split()
    n = int(input[0])
    ai = []
    bi = []
    index = 1
    for i in range(n):
        ai.append(int(input[index]))
        bi.append(int(input[index + 1]))
        index += 2
    ai.sort()
    bi.sort()
    if n % 2 == 1:
        result = bi[n // 2] - ai[n // 2] + 1
    else:
        b = (ai[n // 2] + ai[n // 2 - 1]) / 2.0
        c = (bi[n // 2] + bi[n // 2 - 1]) / 2.0
        result = int(2 * (c - b) + 1)
    print(result)

if __name__ == "__main__":
    main()

