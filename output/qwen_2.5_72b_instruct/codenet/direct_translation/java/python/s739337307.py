import sys

def main():
    import sys
    from collections import defaultdict

    input = sys.stdin.read().split()
    n = int(input[0])
    m = int(input[1])

    map = defaultdict(int)

    countAc = 0
    countWaAll = 0

    idx = 2
    for i in range(m):
        question = int(input[idx])
        waOrAc = input[idx + 1]
        idx += 2

        if question not in map:
            if waOrAc == "WA":
                map[question] = 1
            else:
                map[question] = -1
                countAc += 1
        else:
            countWa = map[question]
            if countWa < 0:
                continue
            else:
                if waOrAc == "WA":
                    map[question] = countWa + 1
                else:
                    map[question] = -countWa
                    countAc += 1
                    countWaAll += countWa

    print(countAc, countWaAll)

if __name__ == "__main__":
    main()
