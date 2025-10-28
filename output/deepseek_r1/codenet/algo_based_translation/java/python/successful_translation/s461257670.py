
import sys

def answer(y, m, d):
    result = 1
    if y % 3 == 0:
        result += 20 - d
    else:
        if m % 2 == 0:
            result += 19 - d
        else:
            result += 20 - d
    for current_month in range(m + 1, 11):
        if y % 3 == 0:
            result += 20
        else:
            if current_month % 2 == 0:
                result += 19
            else:
                result += 20
    for year in range(y + 1, 1000):
        if year % 3 == 0:
            result += 200
        else:
            result += 195
    return result

if __name__ == "__main__":
    count = int(sys.stdin.readline())
    for _ in range(count):
        y, m, d = map(int, sys.stdin.readline().split())
        print(answer(y, m, d))

