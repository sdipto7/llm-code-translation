
import sys

def maxLeft(n):
    return n - 2 if n > 2 else 0

def main():
    import sys
    input = sys.stdin.read().split()
    index = 0
    t = int(input[index])
    index += 1
    for i in range(t):
        n = int(input[index])
        index += 1
        print(maxLeft(n))

if __name__ == "__main__":
    main()

