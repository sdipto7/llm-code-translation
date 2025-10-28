
import sys

def main():
    import sys
    from sys import stdin

    input = stdin.read().split()
    index = 0

    n = int(input[index])
    index += 1

    FfriendPerDay = [0] * 367
    MfriendPerDay = [0] * 367
    answer = 0

    for i in range(n):
        c = input[index]
        index += 1
        a = int(input[index])
        index += 1
        b = int(input[index])
        index += 1

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

