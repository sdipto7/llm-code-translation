
import sys

class Main:
    @staticmethod
    def main(args):
        x = int(input())
        if x < 1200:
            print("ABC")
        else:
            print("ARC")

if __name__ == "__main__":
    Main.main(sys.argv)

