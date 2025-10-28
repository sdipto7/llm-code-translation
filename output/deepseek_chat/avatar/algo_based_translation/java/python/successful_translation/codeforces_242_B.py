
import sys

def main():
    INF = 10**9 + 5
    n = int(sys.stdin.readline())
    a = []
    b = []
    left = INF
    right = 0
    
    for i in range(n):
        data = sys.stdin.readline().split()
        a_val = int(data[0])
        b_val = int(data[1])
        a.append(a_val)
        b.append(b_val)
        left = min(left, a_val)
        right = max(right, b_val)
    
    for i in range(n):
        if left == a[i] and right == b[i]:
            print(i + 1)
            return
    
    print(-1)

if __name__ == "__main__":
    main()

