
import sys

class Main:
    def __init__(self):
        pass

    @staticmethod
    def main():
        n, m = map(int, sys.stdin.readline().split())
        po = []
        for _ in range(n):
            val = int(sys.stdin.readline())
            po.append(val)
            m -= val
        po.sort()
        result = n + m // po[0]
        print(result)

if __name__ == "__main__":
    Main.main()

