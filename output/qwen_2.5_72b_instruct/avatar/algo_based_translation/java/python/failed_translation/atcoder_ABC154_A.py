
import sys

def main():
    import sys
    from io import StringIO
    import re
    
    input = sys.stdin.read
    data = input().split()
    
    str = data[0].split()
    a = int(data[1])
    b = int(data[2])
    u = data[3]
    
    if u == str[0]:
        print(a - 1, b)
    else:
        print(a, b - 1)

if __name__ == "__main__":
    main()

