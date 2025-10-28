import sys

class Main:
    @staticmethod
    def main(args):
        i = 0
        for i in range(1, 6):
            n = int(input())
            if n == 0:
                break
        print(i)

if __name__ == "__main__":
    Main.main(sys.argv)
