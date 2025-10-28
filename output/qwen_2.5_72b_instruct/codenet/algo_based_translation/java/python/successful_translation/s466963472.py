
import sys

class Main:
    @staticmethod
    def read():
        try:
            Main.d = int(input())
            return True
        except ValueError:
            return False

    @staticmethod
    def solve():
        ans = 0
        i = 1
        while i * Main.d < 600:
            x = i * Main.d
            y = x * x
            ans += y * Main.d
            i += 1
        return ans

if __name__ == "__main__":
    main_instance = Main()
    while main_instance.read():
        print(main_instance.solve())

