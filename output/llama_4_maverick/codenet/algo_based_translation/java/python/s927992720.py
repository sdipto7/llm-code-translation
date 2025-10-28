
import sys

class Main:
    def main(self):
        while True:
            try:
                a = int(input().strip())
                op = input().strip()
                b = int(input().strip())
            except ValueError:
                break

            if op == "?":
                break
            if op == "+":
                print(a + b)
            if op == "-":
                print(a - b)
            if op == "*":
                print(a * b)
            if op == "/":
                if b != 0:
                    print(a // b)
                else:
                    sys.stdout.write("Error: Division by zero\n")

if __name__ == "__main__":
    main = Main()
    main.main()

