
def main():
    import sys
    import math

    input = sys.stdin.read().split()
    a = int(input[0])
    b = int(input[1])
    res = a

    while a >= b:
        res += (a // b)
        a = (a // b) + (a % b)

    print(res)

if __name__ == "__main__":
    main()

