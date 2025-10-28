
import sys

def main():
    import sys
    from collections import deque
    
    input = sys.stdin.read
    data = deque(input().split())
    
    n = int(data.popleft())
    levels = int(data.popleft())
    
    arr = [0] * levels
    for i in range(levels):
        arr[i] = int(data.popleft())
    
    level2 = int(data.popleft())
    level3 = levels + level2
    
    arr2 = [0] * level3
    for i in range(levels):
        arr2[i] = arr[i]
    
    for i in range(arr.length, level3):
        arr2[i] = int(data.popleft())
    
    arr3 = [0] * n
    j = 0
    for i in range(n):
        arr3[i] = j + 1
        j += 1
    
    count = 0
    for i in range(n):
        for x in range(level3):
            if arr3[i] == arr2[x]:
                count += 1
                break
    
    if count == n:
        print("I become the guy.")
    else:
        print("Oh, my keyboard!")

if __name__ == "__main__":
    main()


**Note:** The provided code contains an error in `arr.length` which should be `levels` in Python. Here is the corrected version:


import sys

def main():
    input = sys.stdin.read
    data = deque(input().split())
    
    n = int(data.popleft())
    levels = int(data.popleft())
    
    arr = [0] * levels
    for i in range(levels):
        arr[i] = int(data.popleft())
    
    level2 = int(data.popleft())
    level3 = levels + level2
    
    arr2 = [0] * level3
    for i in range(levels):
        arr2[i] = arr[i]
    
    for i in range(levels, level3):
        arr2[i] = int(data.popleft())
    
    arr3 = [0] * n
    j = 0
    for i in range(n):
        arr3[i] = j + 1
        j += 1
    
    count = 0
    for i in range(n):
        for x in range(level3):
            if arr3[i] == arr2[x]:
                count += 1
                break
    
    if count == n:
        print("I become the guy.")
    else:
        print("Oh, my keyboard!")

if __name__ == "__main__":
    from collections import deque
    main()

