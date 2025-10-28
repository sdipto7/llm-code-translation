
import sys

def main():
    w = int(sys.stdin.readline().strip())
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    
    answer = max(a, b) - min(a, b) - w
    
    if answer < 0:
        print(0)
    else:
        print(answer)

if __name__ == "__main__":
    main()

