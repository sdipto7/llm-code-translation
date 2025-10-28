
import sys

def main():
    x, a, y = map(int, sys.stdin.readline().split())
    h = "NO"
    if (x in {5, 7} or a in {5, 7} or y in {5, 7}):
        if x + a + y == 17:
            h = "YES"
    print(h)

if __name__ == "__main__":
    main()

