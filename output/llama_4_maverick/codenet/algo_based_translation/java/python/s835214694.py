
import sys

class Main:
    @staticmethod
    def main():
        try:
            a = int(sys.stdin.readline().strip())
            b = int(sys.stdin.readline().strip())

            if b % a == 0:
                print(a + b)
            else:
                print(b - a)
        except Exception as e:
            pass

if __name__ == "__main__":
    Main.main()

