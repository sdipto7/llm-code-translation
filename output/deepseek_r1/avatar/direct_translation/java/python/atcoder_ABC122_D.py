
class Solution:
    def __init__(self):
        self.N = int(input())
        self.MOD = 10**9 + 7
        self.TOKENS = ['A', 'C', 'G', 'T']
        self.memo = [{} for _ in range(self.N + 1)]

    def calc(self):
        return self.dfs(0, 'TTT')

    def isOK(self, last4):
        if 'AGC' in last4:
            return False
        for i in range(3):
            chars = list(last4)
            chars[i], chars[i+1] = chars[i+1], chars[i]
            if 'AGC' in ''.join(chars):
                return False
        return True

    def dfs(self, current, last3):
        if last3 in self.memo[current]:
            return self.memo[current][last3]
        if current == self.N:
            return 1
        res = 0
        for c in self.TOKENS:
            new_last4 = last3 + c
            if self.isOK(new_last4):
                next_last3 = last3[1:] + c
                res = (res + self.dfs(current + 1, next_last3)) % self.MOD
        self.memo[current][last3] = res
        return res

if __name__ == '__main__':
    ins = Solution()
    print(ins.calc())

