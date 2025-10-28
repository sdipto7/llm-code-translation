
import sys
from collections import defaultdict

def rec(x):
    answer = 0
    for k in range(31, -1, -1):
        if (x & (1 << k)) != 0:
            answer += 1
    return answer

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    a = [0] * 33
    index = 1
    for i in range(n):
        x = int(data[index])
        index += 1
        k = rec(x)
        a[k] += 1
    
    answer = 0.0
    for i in range(len(a)):
        if a[i] > 0:
            summ = (1 + (a[i] - 1)) / 2.0 * (a[i] - 1)
            answer += summ
    
    print(int(answer))

if __name__ == "__main__":
    main()

