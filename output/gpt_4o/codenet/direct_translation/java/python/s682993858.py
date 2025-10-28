
while True:
    sum = 0
    s = input()
    if s == "0":
        break
    for a in s:
        sum += int(a)
    print(sum)

