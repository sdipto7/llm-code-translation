
import sys

def solve():
    data = list(map(int, sys.stdin.read().split()))
    t = data[0]
    arr = data[1:1+t]
    prev_winner = 0
    for n in arr:
        if n == 1 and prev_winner == 0:
            prev_winner = 2
        if prev_winner in (2, 0):
            if (n - 1) % 2 == 0:
                print(2)
                prev_winner = 2
            else:
                print(1)
                prev_winner = 1
        else:
            if (n - 1) % 2 == 0:
                print(1)
                prev_winner = 1
            else:
                print(2)
                prev_winner = 2

if __name__ == "__main__":
    solve()

