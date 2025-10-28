
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    a = list(map(int, data[1:]))
    
    a.sort()
    min_value = a[0]
    
    for value in a:
        if value % min_value != 0:
            print(-1)
            return
    
    print(min_value)

if __name__ == "__main__":
    main()

