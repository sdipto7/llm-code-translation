
import sys

def solve():
    x = next_int()
    t = next_int()
    a = next_int()
    b = next_int()
    da = next_int()
    db = next_int()
    ok = False
    for i in range(t):
        first = a - (da * i)
        for j in range(t):
            second = b - (db * j)
            if second + first == x or second == x or first == x or x == 0:
                ok = True
                break
        if ok:
            break
    if ok:
        sys.stdout.write("YES\n")
    else:
        sys.stdout.write("NO\n")

def main():
    solve()

def next_int():
    return int(next_token())

def next_token():
    global tokens
    while not tokens:
        tokens = input().strip().split()
    return tokens.pop(0)

tokens = []
if __name__ == "__main__":
    main()

