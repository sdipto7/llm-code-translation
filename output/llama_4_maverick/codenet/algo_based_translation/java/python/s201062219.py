
import sys

class Main:
    def main(self):
        try:
            a = [0] * 100000
            x = 0
            while True:
                try:
                    c = int(input().strip())
                    mark = input().strip()
                    b = int(input().strip())
                    if mark == "?":
                        a[x] = 2000001
                        break
                    elif mark == "+":
                        a[x] = c + b
                    elif mark == "-":
                        a[x] = c - b
                    elif mark == "*":
                        a[x] = c * b
                    elif mark == "/":
                        a[x] = c // b
                    x += 1
                except EOFError:
                    break
                except ValueError:
                    break
            x = 0
            while True:
                if a[x] == 2000001:
                    break
                print(a[x])
                x += 1
        except Exception as e:
            pass

if __name__ == "__main__":
    Main().main()

