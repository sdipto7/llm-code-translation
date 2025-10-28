
import sys

def max_left(n):
    if n > 2:
        return n - 2
    else:
        return 0

def main():
    data = sys.stdin.read().split()
    t = int(data[0])
    index = 1
    for i in range(t):
        n = int(data[index])
        index += 1
        print(max_left(n))

if __name__ == "__main__":
    main()

