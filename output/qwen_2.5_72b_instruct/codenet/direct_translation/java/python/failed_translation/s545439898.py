
sc = input().strip()
count = int(sc)
givingNumbers = []

for i in range(count):
    givingNumbers.append(int(input().strip()))

for i in range(count-1, -1, -1):
    print(givingNumbers[i], end=" " if i > 0 else "\n")

