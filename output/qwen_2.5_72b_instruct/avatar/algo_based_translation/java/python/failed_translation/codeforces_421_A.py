
import sys

def main():
    import sys
    from collections import ArrayList

    input = sys.stdin.read().split()
    n = int(input[0])
    a = int(input[1])
    b = int(input[2])
    list1 = []
    list2 = []

    index = 3
    for i in range(a):
        list1.append(int(input[index + i]))

    index += a
    for i in range(b):
        list2.append(int(input[index + i]))

    for i in range(n):
        if i + 1 in list1:
            print("1", end=" ")
        else:
            print("2", end=" ")

if __name__ == "__main__":
    main()


Note: Python does not have an `ArrayList` class, so a regular list is used instead. The input handling is adjusted to read all input at once and split it into parts, as Python's input handling is different from Java's Scanner.
