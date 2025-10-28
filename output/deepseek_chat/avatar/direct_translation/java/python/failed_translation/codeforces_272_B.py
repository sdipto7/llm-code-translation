
import sys
from collections import defaultdict

def rec(x):
    answer = 0
    for k in range(31, -1, -1):
        if (x & (1 << k)) != 0:
            answer += 1
    return answer

def main():
    n = int(sys.stdin.readline())
    a = defaultdict(int)
    for _ in range(n):
        x = int(sys.stdin.readline())
        a[rec(x)] += 1
    answer = 0
    for i in a:
        summ = (1 + a[i] - 1) / 2.0 * (a[i] - 1)
        answer += summ
    print(int(answer))

if __name__ == "__main__":
    main()

