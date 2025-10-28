
import sys

def main():
    input = sys.stdin.read().split()
    a = int(input[0])
    b = int(input[1])
    c = int(input[2])
    d = int(input[3])
    if c > b:
        print(0)
    elif a > d:
        print(0)
    elif a < c:
        print(min(b, d) - c)
    else:
        l = [a, b, c, d]
        l.sort()
        print(l[2] - l[1])

if __name__ == "__main__":
    main()

