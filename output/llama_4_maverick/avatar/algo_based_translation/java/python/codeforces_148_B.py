
VP, VD, T, F, C = map(int, input().split())
if VD <= VP:
    print("0")
else:
    answer = 0
    start = T * VP
    while True:
        x = start / (VD - VP)
        if (start + x * VP) >= C:
            break
        start += 2 * x + F * VP
        answer += 1
    print(answer)

