
import sys

class Main:
    @staticmethod
    def main():
        try:
            a = int(sys.stdin.readline().strip())
            b = int(sys.stdin.readline().strip())
            c = int(sys.stdin.readline().strip())
            if a < b and b < c and a < c:
                print("Yes")
            else:
                print("No")
        except Exception as e:
            pass

if __name__ == "__main__":
    Main.main()

