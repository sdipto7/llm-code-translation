
import sys

def main():
    n = int(sys.stdin.readline().strip())
    result = n * (n + 1) // 2 - n
    print(result)

if __name__ == "__main__":
    main()

