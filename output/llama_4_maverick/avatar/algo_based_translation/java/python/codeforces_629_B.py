
def main():
    FfriendPerDay = [0] * 367
    MfriendPerDay = [0] * 367
    answer = 0
    n = int(input())
    for _ in range(n):
        c, a, b = input().split()
        a, b = int(a), int(b)
        for j in range(a, b + 1):
            if c == 'M':
                MfriendPerDay[j] += 1
            else:
                FfriendPerDay[j] += 1
            if MfriendPerDay[j] < FfriendPerDay[j]:
                if MfriendPerDay[j] > answer:
                    answer = MfriendPerDay[j]
            else:
                if FfriendPerDay[j] > answer:
                    answer = FfriendPerDay[j]
    print(answer * 2)

if __name__ == "__main__":
    main()

