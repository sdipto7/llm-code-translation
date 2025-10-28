
from collections import deque
import sys

def main():
    list = deque()
    for line in sys.stdin:
        try:
            a = int(line.strip())
            if a == 0:
                print(list.popleft())
            else:
                list.appendleft(a)
        except ValueError:
            break

if __name__ == "__main__":
    main()

