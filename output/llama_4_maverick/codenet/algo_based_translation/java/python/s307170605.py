
import sys

class Main:
    @staticmethod
    def main():
        for i in range(5):
            try:
                num = int(input().strip())
                if num == 0:
                    print(i + 1)
                    break
            except ValueError:
                sys.exit(1)

if __name__ == "__main__":
    Main.main()

