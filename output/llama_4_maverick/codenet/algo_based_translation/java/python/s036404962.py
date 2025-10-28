
import sys

class Main:
    @staticmethod
    def main():
        X = int(sys.stdin.readline().strip())
        t = int(sys.stdin.readline().strip())

        if X >= t:
            print(X - t)
        elif X < t:
            print(0)

if __name__ == "__main__":
    Main.main()

