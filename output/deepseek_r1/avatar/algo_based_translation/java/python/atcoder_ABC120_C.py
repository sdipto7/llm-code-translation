
import sys
from collections import deque

def main():
    x = sys.stdin.readline().strip()
    stack = []
    c = 0
    for ch in x:
        stack.append(ch)
        while len(stack) >= 2:
            p = stack.pop()
            q = stack.pop()
            if (p == '1' and q == '0') or (p == '0' and q == '1'):
                c += 1
            else:
                stack.append(q)
                stack.append(p)
                break
    print(c * 2)

if __name__ == "__main__":
    main()

