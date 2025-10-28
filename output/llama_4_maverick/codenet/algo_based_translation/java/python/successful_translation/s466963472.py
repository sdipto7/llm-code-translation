import sys

class Main:
    def __init__(self):
        self.d = None

    def read(self):
        try:
            self.d = int(sys.stdin.readline().strip())
            return True
        except ValueError:
            return False
        except EOFError:
            return False

    def solve(self):
        ans = 0
        i = 1
        while i * self.d < 600:
            x = i * self.d
            y = x * x
            ans += y * self.d
            i += 1
        return ans

def main():
    main_obj = Main()
    while main_obj.read():
        print(main_obj.solve())

if __name__ == "__main__":
    main()
