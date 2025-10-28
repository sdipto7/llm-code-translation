
from collections import deque

class Main:
    def main():
        list = deque()
        while True:
            try:
                a = int(input())
                if a == 0:
                    if list:
                        print(list.pop())
                else:
                    list.append(a)
            except (ValueError, EOFError):
                break

if __name__ == "__main__":
    Main.main()

