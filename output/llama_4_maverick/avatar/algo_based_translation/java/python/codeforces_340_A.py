
import math

def main():
    x, y, a, b = map(int, input().split())
    c = max(x, y)
    ans = True
    j = 2
    if c > b:
        print(0)
        ans = False
    while c % min(x, y) != 0 and ans:
        if x > y:
            c = x * j
            j += 1
        else:
            c = y * j
            j += 1
        if c > b:
            print(0)
            ans = False
            break
    if ans:
        i = a
        while i <= b:
            if i % c == 0:
                break
            i += 1
        if i != b + 1:
            print(((b - i) // c) + 1)
        else:
            print(0)

if __name__ == "__main__":
    main()

