
import sys

class Main:
    def main(self):
        t = int(sys.stdin.readline().strip())
        count = [0] * (t + 1)
        for _ in range(t - 1):
            count[int(sys.stdin.readline().strip())] += 1
        for i in range(1, t + 1):
            print(count[i])

if __name__ == "__main__":
    Main().main()

