
import sys

class Main:
    @staticmethod
    def main():
        a = int(sys.stdin.readline().strip())
        b = int(sys.stdin.readline().strip())
        hb = b // 2
        print(a + hb)

if __name__ == "__main__":
    Main.main()

