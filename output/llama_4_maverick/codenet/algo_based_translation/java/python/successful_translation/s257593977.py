
import math

class Main:
    BASE = 3

    @staticmethod
    def main():
        num = int(input())
        result = int(math.pow(num, Main.BASE))
        print(result)

if __name__ == "__main__":
    Main.main()

