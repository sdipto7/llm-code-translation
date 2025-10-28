
import sys

class Main:
    @staticmethod
    def main():
        try:
            x = int(sys.stdin.readline().strip())
            ans = (2199 - x) // 200
            print(ans)
        except Exception as e:
            pass

if __name__ == "__main__":
    Main.main()

