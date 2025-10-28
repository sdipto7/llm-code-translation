
from collections import defaultdict

class AtcoderABC122D:
    MOD = 1000000007
    TOKENS = ["A", "C", "G", "T"]

    def __init__(self):
        self.N = int(input().strip())
        self.memo = [defaultdict(lambda: -1) for _ in range(self.N + 1)]

    def calc(self) -> int:
        return self.dfs(0, "TTT")

    def isOK(self, last4: str) -> bool:
        if "AGC" in last4:
            return False
        for i in range(3):
            vals = list(last4)
            vals[i], vals[i + 1] = vals[i + 1], vals[i]
            if "AGC" in "".join(vals):
                return False
        return True

    def dfs(self, current: int, last3: str) -> int:
        if self.memo[current][last3] != -1:
            return self.memo[current][last3]
        if current == self.N:
            return 1
        result = 0
        for c in self.TOKENS:
            if self.isOK(last3 + c):
                result = (result + self.dfs(current + 1, last3[1:] + c)) % self.MOD
        self.memo[current][last3] = result
        return result

if __name__ == "__main__":
    instance = AtcoderABC122D()
    print(instance.calc())

