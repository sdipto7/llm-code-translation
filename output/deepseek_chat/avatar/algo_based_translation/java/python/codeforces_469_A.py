
import sys

def main():
    data = sys.stdin.read().split()
    index = 0
    
    n = int(data[index]); index += 1
    levels = int(data[index]); index += 1
    
    arr = []
    for i in range(levels):
        arr.append(int(data[index])); index += 1
        
    level2 = int(data[index]); index += 1
    level3 = levels + level2
    
    arr2 = []
    for i in range(len(arr)):
        arr2.append(arr[i])
        
    for i in range(len(arr), level3):
        arr2.append(int(data[index])); index += 1
        
    arr3 = []
    j = 0
    for i in range(n):
        j += 1
        arr3.append(j)
        
    count = 0
    for i in range(n):
        for x in range(len(arr2)):
            if arr3[i] == arr2[x]:
                count += 1
                break
                
    if count == n:
        print("I become the guy.")
    else:
        print("Oh, my keyboard!")

if __name__ == "__main__":
    main()

