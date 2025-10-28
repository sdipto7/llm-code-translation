
class Main:
    def __init__(self):
        self.sc = __import__('sys').stdin.readline
        self.DEVISOR = 10**9 + 7

    def run(self):
        n, k = map(int, self.sc().split())
        ans = 0
        for i in range(k, n + 2):
            max_val = i * (2 * n - i + 1) // 2
            min_val = i * (i - 1) // 2
            ans = (ans + (max_val - min_val + 1)) % self.DEVISOR
        print(ans)

if __name__ == "__main__":
    Main().run()

