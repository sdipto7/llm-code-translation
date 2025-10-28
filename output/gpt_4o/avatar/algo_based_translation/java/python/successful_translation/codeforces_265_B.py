
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    arr = list(map(int, data[1:n+1]))
    
    ans = arr[0] + 1
    
    for i in range(1, len(arr)):
        ans += abs(arr[i] - arr[i - 1]) + 2
    
    print(ans)

if __name__ == "__main__":
    main()

