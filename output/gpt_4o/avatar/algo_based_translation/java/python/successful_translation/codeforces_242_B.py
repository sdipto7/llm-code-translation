
import sys

def main():
    INF = int(1e9) + 5
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    a = []
    b = []
    
    left = INF
    right = 0
    
    index = 1
    for i in range(n):
        a_i = int(data[index])
        b_i = int(data[index + 1])
        a.append(a_i)
        b.append(b_i)
        left = min(left, a_i)
        right = max(right, b_i)
        index += 2
        
    for i in range(n):
        if a[i] == left and b[i] == right:
            print(i + 1)
            return
    
    print(-1)

if __name__ == "__main__":
    main()

