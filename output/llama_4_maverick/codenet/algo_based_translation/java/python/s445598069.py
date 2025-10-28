
import sys

def main():
    n = int(sys.stdin.readline().strip())
    str = sys.stdin.readline().strip().split(" ")
    s = [0] * 100010
    for i in range(n):
        x = int(str[i])
        s[x] += 1
    for i in range(len(s)):
        if s[i] != 0:
            if s[i] % 2 == 0:
                s[i] = 2
            else:
                s[i] = 1
    one = 0
    two = 0
    for i in range(len(s)):
        if s[i] == 2:
            two += 1
        elif s[i] == 1:
            one += 1
    if two % 2 != 0:
        one -= 1
    print(two + one)

if __name__ == "__main__":
    main()

