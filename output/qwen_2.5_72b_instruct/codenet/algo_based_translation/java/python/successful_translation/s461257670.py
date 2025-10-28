
import sys

def main():
    import sys
    import sys
    sc = sys.stdin
    count = int(sc.readline().strip())

    for _ in range(count):
        y, m, d = map(int, sc.readline().strip().split())
        print(Answer(y, m, d))

def Answer(y, m, d):
    result = 1

    if y % 3 == 0:
        result += 20 - d
    elif m % 2 == 0:
        result += 19 - d
    else:
        result += 20 - d

    m += 1
    for m in range(m, 11):
        if y % 3 == 0:
            result += 20
        else:
            if m % 2 == 0:
                result += 19
            else:
                result += 20

    y += 1
    for y in range(y, 1000):
        if y % 3 == 0:
            result += 200
        else:
            result += 195

    return result

if __name__ == "__main__":
    main()

