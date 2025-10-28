
import sys

class Main:
    def __init__(self):
        pass

    @staticmethod
    def main():
        s = sys.stdin.readline().strip()
        n = int(s[-1])
        if n == 3:
            print("bon")
        elif n in [0, 1, 6, 8]:
            print("pon")
        else:
            print("hon")

if __name__ == "__main__":
    Main.main()

