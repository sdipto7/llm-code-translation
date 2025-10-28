
import sys

def main():
    input = sys.stdin.read
    data = list(map(int, input().split()))
    
    n = data[0]
    m = data[1]
    po = data[2:2 + n]
    
    for i in range(n):
        m -= po[i]
    
    po.sort()
    result = n + m // po[0]
    print(result)

if __name__ == "__main__":
    main()

