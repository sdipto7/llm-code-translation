
def main():
    import sys
    input = sys.stdin.read
    data = input().split()

    n = int(data[0])
    FfriendPerDay = [0] * 367
    MfriendPerDay = [0] * 367
    answer = 0

    index = 1
    for _ in range(n):
        c = data[index]
        a = int(data[index + 1])
        b = int(data[index + 2])
        index += 3

        for j in range(a, b + 1):
            if c == 'M':
                MfriendPerDay[j] += 1
            else:
                FfriendPerDay[j] += 1

    for j in range(1, 367):
        if MfriendPerDay[j] < FfriendPerDay[j]:
            if MfriendPerDay[j] > answer:
                answer = MfriendPerDay[j]
        else:
            if FfriendPerDay[j] > answer:
                answer = FfriendPerDay[j]

    print(answer * 2)

if __name__ == "__main__":
    main()

