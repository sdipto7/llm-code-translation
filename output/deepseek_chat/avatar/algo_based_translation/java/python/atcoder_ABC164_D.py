
import sys

def main():
    S = sys.stdin.readline().strip()
    N = len(S)
    mod_arr = [0] * N
    mod_cnt = [0] * 2019
    radix = 1
    for i in range(N):
        digit_char = S[N - 1 - i]
        digit_val = int(digit_char)
        tmp = digit_val * radix % 2019
        if i != 0:
            tmp = (tmp + mod_arr[i - 1]) % 2019
        mod_arr[i] = tmp
        mod_cnt[tmp] += 1
        radix = radix * 10 % 2019
    
    mod_cnt[0] += 1
    ans = 0
    for i in range(2019):
        count = mod_cnt[i]
        ans += count * (count - 1) // 2
    
    print(ans)

if __name__ == "__main__":
    main()

