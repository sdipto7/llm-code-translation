import sys

class codeforces_313_B:
    def main(self):
        import sys
        input = sys.stdin.read
        data = input().split()
        s = data[0]
        cum = [0] * (len(s) + 1)
        for i in range(1, len(s)):
            if s[i] == s[i - 1]:
                cum[i] = cum[i - 1] + 1
            else:
                cum[i] = cum[i - 1]
        q = int(data[1])
        index = 2
        for _ in range(q):
            l = int(data[index]) - 1
            r = int(data[index + 1]) - 1
            print(cum[r] - cum[l])
            index += 2

if __name__ == "__main__":
    codeforces_313_B().main()
