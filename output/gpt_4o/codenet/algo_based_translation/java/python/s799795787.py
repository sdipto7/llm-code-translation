
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    array = data[1:n+1]
    
    cnt = 0
    
    array.sort()
    
    a = array[0]
    cnt += 1
    
    for i in range(n):
        if a == array[i]:
            continue
        else:
            cnt += 1
        a = array[i]
    
    print(cnt)

if __name__ == "__main__":
    main()

