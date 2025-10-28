
import sys

def main():
    count = int(sys.stdin.readline().strip())
    givingNumbers = [0] * count

    for i in range(count):
        givingNumbers[i] = int(sys.stdin.readline().strip())

    for i in range(count - 1, -1, -1):
        print(givingNumbers[i], end='')
        if i > 0:
            print(' ', end='')
    print()

if __name__ == "__main__":
    main()

