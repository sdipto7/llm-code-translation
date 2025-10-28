
def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    n = int(data[0])
    m = int(data[1])

    map = {}

    countAc = 0
    countWaAll = 0

    index = 2
    for _ in range(m):
        question = int(data[index])
        waOrAc = data[index + 1]
        index += 2
        
        if question not in map:
            if waOrAc == "WA":
                map[question] = 1
            else:
                map[question] = -1
                countAc += 1
        else:
            countWa = map[question]
            if countWa >= 0:
                if waOrAc == "WA":
                    map[question] = countWa + 1
                else:
                    map[question] = -countWa
                    countAc += 1
                    countWaAll += countWa

    print(countAc, countWaAll)

if __name__ == "__main__":
    main()

