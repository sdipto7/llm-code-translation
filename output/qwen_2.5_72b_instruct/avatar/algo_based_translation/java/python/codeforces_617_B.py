
import sys

def main():
    import sys
    from collections import deque
    
    input = sys.stdin.read().split()
    n = int(input[0])
    arr = []
    
    index = 1
    for i in range(n):
        if int(input[index]) == 1:
            arr.append(i)
        index += 1
    
    if not arr:
        print(0)
    else:
        result = 1
        for i in range(1, len(arr)):
            result *= arr[i] - arr[i - 1]
        print(result)

if __name__ == "__main__":
    main()

