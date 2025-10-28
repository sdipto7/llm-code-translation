
import sys

class Main:
    def __init__(self):
        pass

    @staticmethod
    def main():
        x = int(sys.stdin.readline().strip())
        print("ABC" if x < 1200 else "ARC")

if __name__ == "__main__":
    Main.main()

