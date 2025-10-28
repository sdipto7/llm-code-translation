
import sys

def main():
    n = int(sys.stdin.readline())
    s = ""
    while n > 0:
        x = n % 2
        n = n // 2
        s += str(x)
    ans = 0
    for char in s:
        if char == '1':
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()

