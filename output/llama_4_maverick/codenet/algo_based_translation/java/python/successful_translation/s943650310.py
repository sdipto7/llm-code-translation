
import sys

class Main:
    @staticmethod
    def main():
        X, t = map(int, sys.stdin.readline().split())
        if X - t >= 0:
            print(X - t)
        else:
            print(0)

if __name__ == "__main__":
    Main.main()

