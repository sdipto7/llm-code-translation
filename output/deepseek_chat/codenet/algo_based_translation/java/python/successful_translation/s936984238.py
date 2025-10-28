
import sys

def read():
    number = int(sys.stdin.readline())
    if number == 0:
        return False
    score = []
    for i in range(number):
        score.append(int(sys.stdin.readline()))
    return number, score

def slove(number, score):
    score.sort()
    total = 0
    for i in range(1, number - 1):
        total += score[i]
    average = total // (number - 2)
    print(average)

def main():
    while True:
        result = read()
        if result is False:
            break
        number, score = result
        slove(number, score)

if __name__ == "__main__":
    main()

