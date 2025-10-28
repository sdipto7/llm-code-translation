
import sys

def main():
    n = int(sys.stdin.readline())
    array = list(map(int, sys.stdin.readline().split()))
    array.sort()
    head = len(array) - 2
    res = 0
    for i in range(n):
        res += array[head]
        head -= 2
    print(res)

if __name__ == "__main__":
    main()

