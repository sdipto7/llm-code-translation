
MOD = 10**9 + 7

def main():
    run()

def run():
    s = input().strip()
    cs = list(s)
    n = len(cs)
    dp = [[0] * 13 for _ in range(n)]
    base = 1
    
    for i in range(n):
        char_pos = n - 1 - i
        if cs[char_pos] == '?':
            for pre in range(13):
                for next_digit in range(10):
                    new_remainder = (base * next_digit + pre) % 13
                    if i > 0:
                        add_val = dp[i-1][pre]
                    else:
                        add_val = 1 if pre == 0 else 0
                    dp[i][new_remainder] = (dp[i][new_remainder] + add_val) % MOD
        else:
            next_digit = int(cs[char_pos])
            for pre in range(13):
                new_remainder = (base * next_digit + pre) % 13
                if i > 0:
                    add_val = dp[i-1][pre]
                else:
                    add_val = 1 if pre == 0 else 0
                dp[i][new_remainder] = (dp[i][new_remainder] + add_val) % MOD
        
        base = (base * 10) % 13
    
    print(dp[n-1][5])

def tr(*objects):
    print(objects)

if __name__ == '__main__':
    main()

