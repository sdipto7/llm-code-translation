
import sys

def main():
    x, t, a, b, da, db = map(int, sys.stdin.readline().split())
    ok = False
    for i in range(t):
        first = a - (da * i)
        for j in range(t):
            second = b - (db * j)
            if x == 0 or x == first or x == second or x == first + second:
                ok = True
                break
        if ok:
            break
    if ok:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()

