
import sys

def main():
    s = input().strip()
    n = len(s)
    ans = 0
    for mask in range(0, 1 << (n - 1)):
        total_sum = 0
        x = s[0]
        for i in range(n - 1):
            if (mask & (1 << i)) >= 1:
                x += '+' + s[i + 1]
            else:
                x += s[i + 1]
        split_parts = x.split('+')
        for part in split_parts:
            total_sum += int(part)
        ans += total_sum
    print(ans)

if __name__ == "__main__":
    main()

