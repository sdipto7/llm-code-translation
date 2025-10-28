import sys
import random

def main():
    n = int(sys.stdin.readline())
    pre = [0] * (n + 1)
    
    for i in range(1, n + 1):
        pre[i] = pre[i - 1] + int(sys.stdin.readline())
    
    min_diff = float('inf')
    
    for i in range(1, n):
        val1 = pre[i]
        val2 = pre[n] - pre[i]
        min_diff = min(min_diff, abs(val1 - val2))
    
    print(min_diff)

if __name__ == "__main__":
    main()
