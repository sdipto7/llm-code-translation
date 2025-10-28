import sys

class Main:
    @staticmethod
    def main(args):
        Si = input().strip()
        S = Si[::-1]

        dp = [0] * 13
        dp[0] = 1

        d = 1
        for i in range(len(S)):
            nd = [0] * 13

            print(f"d: {d}, i: {i}, S[i]: {S[i]}", file=sys.stderr)
            c = S[i]

            if c.isdigit():
                x = (ord(c) - ord('0')) * d
                for j in range(13):
                    nd[(j + x) % 13] = dp[j]
            else:
                for xi in range(10):
                    x = xi * d
                    for j in range(13):
                        ni = (j + x) % 13
                        nd[ni] = (nd[ni] + dp[j]) % 1000000007

            print(nd, file=sys.stderr)
            dp = nd

        print(dp[5])

if __name__ == "__main__":
    Main.main(sys.argv[1:])
