
count = int(input())
giving_number = [int(input()) for _ in range(count)]
for i in range(count - 1, -1, -1):
    print(giving_number[i], end=' ' if i > 0 else '\n')

