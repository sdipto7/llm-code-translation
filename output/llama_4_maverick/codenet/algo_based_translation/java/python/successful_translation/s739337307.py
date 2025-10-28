
import sys

def main():
    try:
        tokens = sys.stdin.read().split()
        token_index = 0

        n = int(tokens[token_index])
        token_index += 1
        m = int(tokens[token_index])
        token_index += 1

        map = {}
        count_ac = 0
        count_wa_all = 0

        for _ in range(m):
            question = int(tokens[token_index])
            token_index += 1
            wa_or_ac = tokens[token_index]
            token_index += 1

            if question not in map:
                if wa_or_ac == "WA":
                    map[question] = 1
                else:
                    map[question] = -1
                    count_ac += 1
            else:
                count_wa = map[question]
                if count_wa >= 0:
                    if wa_or_ac == "WA":
                        map[question] = count_wa + 1
                    else:
                        map[question] = -count_wa - 1
                        count_ac += 1
                        count_wa_all += count_wa

        print(f"{count_ac} {count_wa_all}")
    except Exception as e:
        print(e, file=sys.stderr)

if __name__ == "__main__":
    main()

