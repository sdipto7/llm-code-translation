
import sys

class Main:
    @staticmethod
    def main():
        A = int(sys.stdin.readline().strip())
        B = int(sys.stdin.readline().strip())
        C = int(sys.stdin.readline().strip())
        if A == B == C:
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    Main.main()

