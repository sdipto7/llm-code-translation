
import sys

def main():
    input = sys.stdin.read().strip().split()
    a = int(input[0])
    b = int(input[1])
    c = a - b * 2
    if c < 0:
        c = 0
    print(c)

if __name__ == "__main__":
    main()

