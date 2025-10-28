
import sys

input = sys.stdin.read().split()
n = int(input[0])
FfriendPerDay = [0] * 367
MfriendPerDay = [0] * 367
answer = 0
index = 1
for i in range(n):
    c = input[index]
    a = int(input[index + 1])
    b = int(input[index + 2])
    index += 3
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

