
import sys

def read():
    global number, score
    try:
        number = int(input().strip())
        if number == 0:
            return False
        score = list(map(int, input().strip().split()))
        return True
    except:
        return False

def solve():
    score.sort()
    total_sum = sum(score[1:number-1])
    average = total_sum // (number - 2)
    print(average)

def main():
    while read():
        solve()

if __name__ == "__main__":
    main()

