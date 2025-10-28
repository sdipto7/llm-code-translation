from collections import deque
import sys

def main():
    scan = sys.stdin
    list = deque()

    for line in scan:
        a = int(line.strip())
        if a == 0:
            print(list.popleft())
        else:
            list.appendleft(a)

if __name__ == "__main__":
    main()
