
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    k = int(data[1])
    a = list(map(int, data[2:2+n]))
    
    x = [0] * 200010
    
    for i in range(n):
        index = a[i] - 1
        x[index] += 1
        
    x.sort()
    
    ans = 0
    for i in range(200010 - k):
        ans += x[i]
        
    print(ans)

if __name__ == "__main__":
    main()

