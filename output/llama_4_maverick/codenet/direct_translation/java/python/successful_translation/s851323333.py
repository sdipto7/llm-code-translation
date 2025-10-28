
from collections import deque

def main():
    lst = deque()
    while True:
        try:
            a = int(input())
            if a == 0:
                print(lst.pop())
            else:
                lst.append(a)
        except ValueError:
            break

if __name__ == "__main__":
    main()

