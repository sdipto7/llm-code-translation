
import sys

def main():
    n = int(sys.stdin.readline().strip())
    array = list(map(int, sys.stdin.readline().split()))
    array.sort()
    res = 0
    head = len(array) - 2
    for _ in range(n):
        res += array[head]
        head -= 2
    print(res)

if __name__ == "__main__":
    main()

