
import sys
import math

class Main:
    def __init__(self):
        self.sb = ""

    def run(self):
        for line in sys.stdin:
            try:
                a, b = map(int, line.split())
                digit = math.floor(math.log10(a + b)) + 1
                self.sb += str(digit) + '\n'
            except ValueError:
                break
        sys.stdout.write(self.sb)

if __name__ == "__main__":
    main = Main()
    main.run()

