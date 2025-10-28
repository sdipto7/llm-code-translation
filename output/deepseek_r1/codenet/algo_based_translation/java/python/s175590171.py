
import sys

def main():
    data = list(map(int, sys.stdin.read().split()))
    n = data[0]
    a = data[1:n+1]
    a.sort()
    
    total_sum = 0
    count = 0
    
    for i in range(n-1):
        total_sum += a[i]
        if a[i+1] <= 2 * total_sum:
            count += 1
        else:
            count = 0
    
    print(count + 1)

if __name__ == "__main__":
    main()

