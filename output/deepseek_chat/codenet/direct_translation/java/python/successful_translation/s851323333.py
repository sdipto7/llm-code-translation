from collections import deque
import sys

def main():
    stack = deque()
    for line in sys.stdin:
        try:
            a = int(line.strip())
            if a == 0:
                print(stack.pop())
            else:
                stack.append(a)
        except ValueError:
            break

if __name__ == "__main__":
    main()
