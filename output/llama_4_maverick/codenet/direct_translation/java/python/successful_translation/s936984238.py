
import sys

def read():
    global number, score
    number = int(sys.stdin.readline().strip())
    if number == 0:
        return False
    score = list(map(int, sys.stdin.readline().split()))
    for i in range(1, number):
        score.extend(map(int, sys.stdin.readline().split()))
    score = score[:number]
    return True

def slove():
    global number, score
    score.sort()
    sum_score = sum(score[1:number-1])
    print(sum_score // (number-2))

while read():
    slove()

