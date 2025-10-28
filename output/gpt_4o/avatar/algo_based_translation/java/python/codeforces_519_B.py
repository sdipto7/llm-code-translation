
import sys

def main():
    input = sys.stdin.read
    data = list(map(int, input().split()))
    
    n = data[0]
    index = 1
    a = sum(data[index:index + n])
    index += n
    b = sum(data[index:index + n - 1])
    index += n - 1
    c = sum(data[index:index + n - 2])
    
    x = a - b
    y = b - c
    
    print(x)
    print(y)

if __name__ == "__main__":
    main()

