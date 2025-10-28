
import sys

def main():
    input = sys.stdin.read().split()
    A = int(input[0])
    B = int(input[1])
    amari = 0
    result = 0
    result = (B - 1) // (A - 1)
    amari = (B - 1) % (A - 1)
    if amari != 0:
        result += 1
    print(result)

if __name__ == "__main__":
    main()

