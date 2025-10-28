
import sys

def main():
    while True:
        a = int(input())
        op = input().strip()
        b = int(input())

        if op == "?":
            break
        if op == "+":
            print(a + b)
        if op == "-":
            print(a - b)
        if op == "*":
            print(a * b)
        if op == "/":
            print(a // b)

if __name__ == "__main__":
    main()

