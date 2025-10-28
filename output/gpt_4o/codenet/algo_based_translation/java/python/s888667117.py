
import sys

def main():
    Si = input().strip()
    S = list(Si[::-1])

    dp = [0] * 13
    dp[0] = 1

    d = 1
    for i in range(len(S)):
        nd = [0] * 13

        sys.stderr.write(f"d: {d}, i: {i}, S[i]: {S[i]}\n")
        c = S[i]

        if c.isdigit():
            x = (int(c) - 0) * d

            for j in range(13):
                nd[(j + x) % 13] = dp[j]
        else:
            for xi in range(10):
                x = xi * d

                for j in range(13):
                    ni = (j + x) % 13
                    nd[ni] = (nd[ni] + dp[j]) % 1000000007

        sys.stderr.write(f"{nd}\n")
        dp = nd

        d = d * 10 % 13

    print(dp[5])

if __name__ == "__main__":
    main()

