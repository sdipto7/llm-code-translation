
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    count = int(data[0])
    index = 1
    for _ in range(count):
        y = int(data[index])
        m = int(data[index + 1])
        d = int(data[index + 2])
        index += 3
        print(answer(y, m, d))

def answer(y, m, d):
    result = 1
    if y % 3 == 0:
        result += 20 - d
    elif m % 2 == 0:
        result += 19 - d
    else:
        result += 20 - d
    for _ in range(m + 1, 11):
        if y % 3 == 0:
            result += 20
        else:
            if _ % 2 == 0:
                result += 19
            else:
                result += 20
    for _ in range(y + 1, 1000):
        if _ % 3 == 0:
            result += 200
        else:
            result += 195
    return result

if __name__ == "__main__":
    main()

