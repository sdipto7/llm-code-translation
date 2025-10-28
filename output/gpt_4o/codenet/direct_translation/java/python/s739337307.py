
def main():
    try:
        n, m = map(int, input().split())

        map = {}

        count_ac = 0
        count_wa_all = 0

        for _ in range(m):
            question, wa_or_ac = input().split()
            question = int(question)

            if question not in map:
                if wa_or_ac == "WA":
                    map[question] = 1
                else:
                    map[question] = -1
                    count_ac += 1
            else:
                count_wa = map[question]
                if count_wa < 0:
                    pass
                else:
                    if wa_or_ac == "WA":
                        map[question] = count_wa + 1
                    else:
                        map[question] = -count_wa
                        count_ac += 1
                        count_wa_all += count_wa

        print(count_ac, count_wa_all)

    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()

