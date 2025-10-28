
import sys

def read():
    global number, score
    number = int(sys.stdin.readline().strip())
    if number == 0:
        return False
    score = [int(sys.stdin.readline().strip()) for _ in range(number)]
    return True

def slove():
    score.sort()
    sum_scores = sum(score[1:number-1])
    print(sum_scores // (number - 2))

if __name__ == "__main__":
    while read():
        slove()

