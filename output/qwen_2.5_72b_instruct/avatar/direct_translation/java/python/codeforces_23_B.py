import sys

def main():
    input = sys.stdin.read().split()
    t = int(input[0])
    index = 1
    for _ in range(t):
        n = int(input[index])
        index += 1
        print(maxLeft(n))

def maxLeft(n):
    return n - 2 if n > 2 else 0

if __name__ == "__main__":
    main()
