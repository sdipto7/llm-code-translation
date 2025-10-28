
n = int(input())
FfriendPerDay = [0] * 367
MfriendPerDay = [0] * 367
answer = 0
for _ in range(n):
    c = input().split()
    gender = c[0]
    a, b = int(c[1]), int(c[2])
    for j in range(a, b + 1):
        if gender == 'M':
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

