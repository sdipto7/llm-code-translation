
import sys

class Main:
    def __init__(self):
        pass

    @staticmethod
    def main():
        for line in sys.stdin:
            try:
                a, b = map(int, line.split())
                if a > b:
                    print("GREATER")
                elif a < b:
                    print("LESS")
                else:
                    print("EQUAL")
            except ValueError:
                break

if __name__ == "__main__":
    Main.main()

