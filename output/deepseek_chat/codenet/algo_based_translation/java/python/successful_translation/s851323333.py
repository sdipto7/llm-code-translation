import sys
from collections import deque

def main():
    scanner = sys.stdin
    stack = deque()
    
    while True:
        try:
            line = input().strip()
            if not line:
                continue
            num = int(line)
            if num == 0:
                print(stack.pop())
            else:
                stack.append(num)
        except EOFError:
            break
        except ValueError:
            break

if __name__ == "__main__":
    main()
