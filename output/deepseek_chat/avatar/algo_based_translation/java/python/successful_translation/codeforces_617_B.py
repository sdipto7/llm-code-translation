
import sys

def main():
    n = int(sys.stdin.readline())
    arr = []
    data = sys.stdin.readline().split()
    for i in range(n):
        num = int(data[i])
        if num == 1:
            arr.append(i)
    
    if len(arr) == 0:
        print(0)
    else:
        result = 1
        for i in range(1, len(arr)):
            result *= (arr[i] - arr[i-1])
        print(result)

if __name__ == "__main__":
    main()

