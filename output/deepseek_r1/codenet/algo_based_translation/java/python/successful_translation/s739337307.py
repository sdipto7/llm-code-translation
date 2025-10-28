
def main():
    import sys

    n, m = map(int, sys.stdin.readline().split())
    status = {}
    count_ac = 0
    count_wa_all = 0

    for _ in range(m):
        parts = sys.stdin.readline().split()
        q = int(parts[0])
        res = parts[1]

        if q not in status:
            if res == 'AC':
                status[q] = -1
                count_ac += 1
            else:
                status[q] = 1
        else:
            current = status[q]
            if current < 0:
                continue
            if res == 'WA':
                status[q] += 1
            else:
                count_ac += 1
                count_wa_all += current
                status[q] = -current

    print(f"{count_ac} {count_wa_all}")

if __name__ == "__main__":
    main()

