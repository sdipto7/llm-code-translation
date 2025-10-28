
import sys

def main():
    x = int(sys.stdin.readline())
    tmp = x
    x = 0
    count = 0
    while x != 360:
        x += tmp
        if x > 360:
            x -= 360
        count += 1
    print(count)

if __name__ == "__main__":
    main()

