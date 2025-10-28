
import sys

def main():
    n = int(input().strip())
    array = [None] * n
    cnt = 0
    
    for i in range(n):
        array[i] = input().strip()
    
    array.sort()
    
    a = array[0]
    cnt = 1
    
    for i in range(n):
        if a != array[i]:
            cnt += 1
        a = array[i]
    
    print(cnt)

if __name__ == "__main__":
    main()

