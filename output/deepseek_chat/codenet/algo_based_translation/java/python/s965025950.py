import sys

class Main:
    @staticmethod
    def main(args):
        x = int(input())
        y = int(input())
        z = int(input())
        print(f"{z} {x} {y}")

if __name__ == "__main__":
    Main.main(sys.argv)
