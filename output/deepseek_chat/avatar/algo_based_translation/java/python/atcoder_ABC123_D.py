
import sys
from typing import List

def main():
    data = sys.stdin.read().split()
    index = 0
    
    x = [0] * 3
    max_val = 0
    for i in range(3):
        x[i] = int(data[index]); index += 1
        if x[i] > max_val:
            max_val = x[i]
    
    k = int(data[index]); index += 1
    
    a = [None] * 3
    for i in range(3):
        a[i] = []
        for j in range(x[i]):
            a[i].append(int(data[index])); index += 1
        a[i].sort()
    
    ans = []
    for i in range(x[0]):
        for j in range(x[1]):
            for m in range(x[2]):
                if (i + 1) * (j + 1) * (m + 1) <= k:
                    tmp = a[0][x[0] - i - 1] + a[1][x[1] - j - 1] + a[2][x[2] - m - 1]
                    ans.append(tmp)
    
    ans.sort()
    n = len(ans)
    for i in range(k):
        print(ans[n - i - 1])

if __name__ == "__main__":
    main()

