
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    m = int(data[1])
    
    req = []
    pre = []
    
    index = 2
    for _ in range(n):
        req.append(int(data[index]))
        index += 1
        
    for _ in range(m):
        pre.append(int(data[index]))
        index += 1
    
    i = n - 1
    j = m - 1
    ans = 0
    
    while i >= 0 and j >= 0:
        if req[i] > pre[j]:
            ans += 1
        else:
            j -= 1
        i -= 1
    
    print(ans + i + 1)

if __name__ == "__main__":
    main()

