
import sys

class Main:
    def __init__(self):
        pass

    @staticmethod
    def max_int(x, a):
        bignum = x
        for num in a:
            bignum = max(bignum, num)
        return bignum

    @staticmethod
    def min_int(y, b):
        smallnum = y
        for num in b:
            smallnum = min(smallnum, num)
        return smallnum

    @staticmethod
    def check_war(a, b):
        if a >= b:
            print("War")
        else:
            print("No War")

    @staticmethod
    def main():
        inputs = sys.stdin.readline().split()
        m, n, x, y = map(int, inputs)
        a = list(map(int, sys.stdin.readline().split()))
        b = list(map(int, sys.stdin.readline().split()))
        x_max = Main.max_int(x, a)
        y_min = Main.min_int(y, b)
        Main.check_war(x_max, y_min)

if __name__ == "__main__":
    Main.main()

