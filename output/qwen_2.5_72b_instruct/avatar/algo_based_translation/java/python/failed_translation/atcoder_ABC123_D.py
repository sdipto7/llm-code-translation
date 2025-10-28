
import sys
from typing import List

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    x = [int(data[0]), int(data[1]), int(data[2])]
    k = int(data[6])
    
    a = [List[int] for _ in range(3)]
    index = 7
    for i in range(3):
        a[i] = [int(data[index + j]) for j in range(x[i])]
        a[i].sort()
        index += x[i]
    
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

