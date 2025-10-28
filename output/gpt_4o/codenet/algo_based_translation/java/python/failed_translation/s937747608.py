
import sys

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    c = int(sys.stdin.readline().strip())
    d = int(sys.stdin.readline().strip())
    
    if a * b >= c * d:
        print(a * b)
    else:
        print(c * d)

if __name__ == "__main__":
    main()

