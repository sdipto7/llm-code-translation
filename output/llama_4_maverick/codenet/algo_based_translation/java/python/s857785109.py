
import sys

class Main:
    @staticmethod
    def main():
        n = int(sys.stdin.readline().strip())
        if (n // 10) % 111 == 0:
            print("Yes")
        elif (n % 1000) % 111 == 0:
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    Main.main()

