
import sys

def read(length):
    return [sys.stdin.readline().strip() for _ in range(length)]

def main():
    n = int(read(1)[0])
    if n == 1:
        print("Hello World")
    else:
        strs = read(2)
        print(int(strs[0]) + int(strs[1]))

if __name__ == "__main__":
    main()

