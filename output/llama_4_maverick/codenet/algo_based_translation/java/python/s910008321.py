
import sys

def main():
    try:
        h, a = map(int, sys.stdin.readline().split())
        if h % a == 0:
            print(h // a)
        else:
            print(h // a + 1)
    except Exception as e:
        pass

if __name__ == "__main__":
    main()

