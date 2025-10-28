import sys

def main():
    while True:
        try:
            a = int(input())
            op = input().strip()
            b = int(input())
        except ValueError:
            print("Invalid input")
            continue

        if op == "?":
            break
        elif op == "+":
            print(a + b)
        elif op == "-":
            print(a - b)
        elif op == "*":
            print(a * b)
        elif op == "/":
            if b != 0:
                print(a // b)
            else:
                print("Division by zero")

if __name__ == "__main__":
    main()
