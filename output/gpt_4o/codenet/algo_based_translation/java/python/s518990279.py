
import sys

BIG_NUM = 2000000000
MOD = 1000000007

def main():
    while True:
        try:
            inputed = input().strip()
            if len(inputed) == 1 and inputed == "0":
                break

            ans = 0
            for i in range(len(inputed)):
                ans += int(inputed[i]) - int('0')

            print(f"{ans}")

        except EOFError:
            break

if __name__ == "__main__":
    main()

