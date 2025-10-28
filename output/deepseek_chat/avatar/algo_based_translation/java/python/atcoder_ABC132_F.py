
mod = 10**9 + 7

def main():
    import sys
    data = sys.stdin.read().split()
    n = int(data[0])
    k = int(data[1])
    
    len_list = []
    l = 1
    while l <= n:
        r = n // (n // l)
        len_list.append(r - l + 1)
        l = r + 1
        
    q = len(len_list)
    dp = [0] * (k * (q + 1))
    
    for j in range(1, q + 1):
        dp[j] = len_list[j - 1] + dp[j - 1]
        
    for i in range(1, k):
        for j in range(1, q + 1):
            index1 = i * (q + 1) + j
            index2 = i * (q + 1) + j - 1
            index3 = (i - 1) * (q + 1) + q - j + 1
            dp[index1] = dp[index2] + dp[index3] * len_list[j - 1]
            dp[index1] %= mod
            
    print(dp[k * (q + 1) - 1])

if __name__ == "__main__":
    main()

