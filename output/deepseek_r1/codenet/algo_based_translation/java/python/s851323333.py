
import sys
from collections import deque

def main():
    stack = deque()
    for token in sys.stdin.read().split():
        try:
            a = int(token)
        except ValueError:
            break
        if a == 0:
            print(stack.popleft())
        else:
            stack.appendleft(a)

if __name__ == "__main__":
    main()

