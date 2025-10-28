
def read():
    global number, score
    number = int(input())
    if number == 0:
        return False
    score = [int(input()) for _ in range(number)]
    return True

def slove():
    score.sort()
    total = sum(score[1:number-1])
    print(total // (number - 2))

while read():
    slove()

