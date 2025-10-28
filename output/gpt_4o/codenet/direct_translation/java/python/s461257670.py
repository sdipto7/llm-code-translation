
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    count = int(data[0])
    index = 1
    results = []
    
    for _ in range(count):
        y = int(data[index])
        m = int(data[index + 1])
        d = int(data[index + 2])
        index += 3
        results.append(answer(y, m, d))
    
    for res in results:
        print(res)

def answer(y, m, d):
    result = 1

    if y % 3 == 0:
        result += 20 - d
    elif m % 2 == 0:
        result += 19 - d
    else:
        result += 20 - d

    m += 1
    while m <= 10:
        if y % 3 == 0:
            result += 20
        else:
            if m % 2 == 0:
                result += 19
            else:
                result += 20
        m += 1

    y += 1
    while y < 1000:
        if y % 3 == 0:
            result += 200
        else:
            result += 195
        y += 1

    return result

if __name__ == "__main__":
    main()

