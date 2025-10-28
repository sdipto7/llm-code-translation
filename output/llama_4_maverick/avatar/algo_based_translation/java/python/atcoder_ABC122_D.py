
MOD = 1000000007

def isOK(last4):
    if "AGC" in last4:
        return False
    for i in range(3):
        vals = list(last4)
        vals[i], vals[i + 1] = vals[i + 1], vals[i]
        s = "".join(vals)
        if "AGC" in s:
            return False
    return True

def dfs(current, last3, N, TOKENS, memo):
    if (current, last3) in memo:
        return memo[(current, last3)]
    if current == N:
        return 1
    result = 0
    for c in TOKENS:
        if isOK(last3 + c):
            result = (result + dfs(current + 1, last3[1:] + c, N, TOKENS, memo)) % MOD
    memo[(current, last3)] = result
    return result

def calc(N):
    TOKENS = ["A", "C", "G", "T"]
    memo = {}
    return dfs(0, "TTT", N, TOKENS, memo)

def main():
    N = int(input())
    print(calc(N))

if __name__ == "__main__":
    main()

