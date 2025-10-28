
import sys

def main():
    tokens = map(int, sys.stdin.read().split())
    while True:
        try:
            a = next(tokens)
            b = next(tokens)
        except StopIteration:
            break
        c = max(a, b)
        if a == c and b != c:
            print("GREATER")
        elif b == c and a != c:
            print("LESS")
        else:
            print("EQUAL")

if __name__ == "__main__":
    main()

