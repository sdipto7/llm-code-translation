import math
import sys

def main():
    stdIn = sys.stdin
    x = int(stdIn.readline().strip())

    if x != 2 and x % 2 == 0:
        x += 1

    while True:
        sqrtNum = math.sqrt(x)

        for i in range(3, int(sqrtNum) + 1, 2):
            if x % i == 0:
                break

        if i > sqrtNum:
            break

        x += 2

    print(x)

if __name__ == "__main__":
    main()
