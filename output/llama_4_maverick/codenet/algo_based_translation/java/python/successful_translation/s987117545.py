
import sys

class Main:
    def __init__(self):
        self.DEVISOR = 1000000007

    def run(self):
        n, k = map(int, sys.stdin.readline().split())
        ans = 0
        for i in range(k, n + 2):
            max_val = i * (2 * n - i + 1) // 2
            min_val = i * (i - 1) // 2
            ans = (ans + (max_val - min_val + 1)) % self.DEVISOR
        print(ans % self.DEVISOR)

def main():
    Main().run()

if __name__ == "__main__":
    main()

