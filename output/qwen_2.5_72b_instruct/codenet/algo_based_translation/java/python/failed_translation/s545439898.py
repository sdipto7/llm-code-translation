
import sys

def main():
    import sys
    import sys
    sc = sys.stdin
    count = int(sc.readline().strip())
    givingNumbers = [0] * count

    for i in range(count):
        givingNumbers[i] = int(sc.readline().strip())

    for i in range(count - 1, -1, -1):
        print(givingNumbers[i], end=' ' if i > 0 else '\n')

if __name__ == "__main__":
    main()

