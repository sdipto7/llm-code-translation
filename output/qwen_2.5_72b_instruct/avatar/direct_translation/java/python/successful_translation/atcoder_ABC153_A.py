
import sys

def main():
    h, a = map(int, input().split())
    num = 0
    while h > 0:
        h -= a
        num += 1
    print(num)

if __name__ == "__main__":
    main()

