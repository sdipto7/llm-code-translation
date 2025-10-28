import sys

BIG_NUM = 2000000000
MOD = 1000000007

def main():
    while True:
        inputed = sys.stdin.readline().strip()
        if len(inputed) == 1 and inputed == '0':
            break
        ans = 0
        for char in inputed:
            ans += int(char)
        print(ans)

if __name__ == "__main__":
    main()
