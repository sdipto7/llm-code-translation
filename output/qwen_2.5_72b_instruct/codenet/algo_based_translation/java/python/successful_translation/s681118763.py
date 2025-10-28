
import sys

def main():
    c = sys.stdin.read().strip()
    letter = ord(c[0]) + 1
    print(chr(letter))

if __name__ == "__main__":
    main()

