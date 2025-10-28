
import sys

class Main:
    def main():
        num = int(sys.stdin.readline().strip())
        if num < 1200:
            print("ABC")
        else:
            print("ARC")

if __name__ == "__main__":
    Main.main()

