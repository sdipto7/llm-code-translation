
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    m = int(data[1])
    req = list(map(int, data[2:2+n]))
    pre = list(map(int, data[2+n:2+n+m]))
    
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

