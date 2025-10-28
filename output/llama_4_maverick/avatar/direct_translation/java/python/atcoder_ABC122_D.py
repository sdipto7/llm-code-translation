
TOKENS = ["A", "C", "G", "T"]
MOD = 1000000007

class AtcoderABC122D:
    def __init__(self):
        self.N = int(input())
        self.memo = [{} for _ in range(self.N + 1)]

    def calc(self):
        return self.dfs(0, "TTT")

    def isOK(self, last4):
        if "AGC" in last4:
            return False
        vals = list(last4)
        for i in range(3):
            vals[i], vals[i + 1] = vals[i + 1], vals[i]
            s = "".join(vals)
            if "AGC" in s:
                return False
            vals[i], vals[i + 1] = vals[i + 1], vals[i]
        return True

    def dfs(self, current, last3):
        if last3 in self.memo[current]:
            return self.memo[current][last3]
        if current == self.N:
            return 1
        result = 0
        for c in TOKENS:
            if self.isOK(last3 + c):
                result = (result + self.dfs(current + 1, last3[1:] + c)) % MOD
        self.memo[current][last3] = result
        return result

    def solve(self):
        print(self.calc())

if __name__ == "__main__":
    ins = AtcoderABC122D()
    ins.solve()

