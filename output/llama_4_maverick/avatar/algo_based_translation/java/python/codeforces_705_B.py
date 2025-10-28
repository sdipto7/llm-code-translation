
import sys

def main():
    t = 1
    while t > 0:
        t -= 1
        solve()

def solve():
    t = int(sys.stdin.readline().strip())
    arr = list(map(int, sys.stdin.readline().split()))
    prevWinner = 0
    for i in range(t):
        if arr[i] == 1:
            if prevWinner == 0:
                prevWinner = 2
        if prevWinner == 2 or prevWinner == 0:
            if (arr[i] - 1) % 2 == 0:
                print(2)
                prevWinner = 2
            else:
                print(1)
                prevWinner = 1
        else:
            if (arr[i] - 1) % 2 == 0:
                print(1)
                prevWinner = 1
            else:
                print(2)
                prevWinner = 2

if __name__ == "__main__":
    main()

