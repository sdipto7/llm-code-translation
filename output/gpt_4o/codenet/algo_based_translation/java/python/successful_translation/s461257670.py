
import sys

def answer(y, m, d):
    result = 1

    if y % 3 == 0:
        result += 20 - d
    elif m % 2 == 0:
        result += 19 - d
    else:
        result += 20 - d

    for m in range(m + 1, 11):
        if y % 3 == 0:
            result += 20
        else:
            if m % 2 == 0:
                result += 19
            else:
                result += 20

    for y in range(y + 1, 1000):
        if y % 3 == 0:
            result += 200
        else:
            result += 195

    return result

def main():
    input = sys.stdin.read
    data = input().strip().split()
    count = int(data[0])
    index = 1
    results = []
    
    for _ in range(count):
        y = int(data[index])
        m = int(data[index + 1])
        d = int(data[index + 2])
        results.append(answer(y, m, d))
        index += 3
    
    for result in results:
        print(result)

if __name__ == "__main__":
    main()

