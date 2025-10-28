
import sys

def main():
    x, y, a, b = map(int, sys.stdin.readline().split())
    j = 2
    ans = True
    c = max(x, y)
    if c > b:
        print(0)
        ans = False
    while c % min(x, y) != 0 and ans:
        if x > y:
            c = x * j
        else:
            c = y * j
        j += 1
        if c > b:
            print(0)
            ans = False
            break
    if ans:
        found = False
        for i in range(a, b + 1):
            if i % c == 0:
                found = True
                break
        if found:
            print(((b - i) // c) + 1)
        else:
            print(0)

if __name__ == "__main__":
    main()

