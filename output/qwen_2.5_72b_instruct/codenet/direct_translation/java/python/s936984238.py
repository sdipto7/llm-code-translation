
import sys

def main():
    while read():
        solve()

def read():
    global number, score
    number = int(input().strip())
    if number == 0:
        return False
    score = list(map(int, input().strip().split()))
    return True

def solve():
    score.sort()
    total = sum(score[1:number-1])
    print(total // (number - 2))

if __name__ == "__main__":
    main()

