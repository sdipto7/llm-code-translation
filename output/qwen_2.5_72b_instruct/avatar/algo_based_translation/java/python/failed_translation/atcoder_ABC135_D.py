
class AtCoderABC135D:
    def __init__(self):
        self.MOD = 1000000007

    def run(self):
        import sys
        input = sys.stdin.read().strip()
        cs = list(input)
        dp = [[0] * 13 for _ in range(len(cs))]
        base = 1
        for i in range(len(cs) - 1, -1, -1):
            if cs[i] == '?':
                for pre in range(13):
                    for next in range(10):
                        dp[i][(base * next + pre) % 13] += (dp[i - 1][pre] if i > 0 else (1 if pre == 0 else 0))
                        dp[i][(base * next + pre) % 13] %= self.MOD
            else:
                next = int(cs[i])
                for pre in range(13):
                    dp[i][(base * next + pre) % 13] += (dp[i - 1][pre] if i > 0 else (1 if pre == 0 else 0))
                    dp[i][(base * next + pre) % 13] %= self.MOD
            base = (base * 10) % 13
        print(dp[len(cs) - 1][5])

    def tr(self, *objects):
        print(str(objects))

def main():
    obj = AtCoderABC135D()
    obj.run()

if __name__ == "__main__":
    main()

