
import sys

def main():
    while True:
        total = 0
        s = input().strip()
        if s == "0":
            break
        for char in s:
            total += int(char)
        print(total)

if __name__ == "__main__":
    main()

