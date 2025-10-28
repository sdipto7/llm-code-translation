import sys

def main():
    s = input().strip()
    n = len(s)
    ans = 0
    for mask in range(0, 1 << (n - 1)):
        sum_val = 0
        x = s[0]
        for i in range(n - 1):
            if (mask & (1 << i)) >= 1:
                x += "+" + s[i + 1]
            else:
                x += s[i + 1]
        split = x.split("+")
        for num in split:
            sum_val += int(num)
        ans += sum_val
    print(ans)

if __name__ == "__main__":
    main()
