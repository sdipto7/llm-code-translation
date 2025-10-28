
import sys

class Main:
    def main():
        try:
            a = int(sys.stdin.readline().strip())
            b = int(sys.stdin.readline().strip())
            if a % 2 == 0 or b % 2 == 0:
                print("No")
            else:
                print("Yes")
        except Exception as e:
            raise Exception(e)

if __name__ == "__main__":
    Main.main()

