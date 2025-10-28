
import sys

class Main:
    @staticmethod
    def main(args):
        sc = sys.stdin
        t = int(sc.readline())
        count = [0] * (t + 1)
        for i in range(2, t + 1):
            num = int(sc.readline())
            count[num] += 1
        for i in range(1, t + 1):
            print(count[i])

if __name__ == "__main__":
    Main.main(sys.argv)

