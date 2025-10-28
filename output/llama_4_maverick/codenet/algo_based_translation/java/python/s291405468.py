
import sys

class Main:
    @staticmethod
    def main():
        num1 = int(sys.stdin.readline().strip())
        num2 = int(sys.stdin.readline().strip())
        remainder = num1 % 500
        result = "Yes" if remainder <= num2 else "No"
        print(result)

if __name__ == "__main__":
    Main.main()

