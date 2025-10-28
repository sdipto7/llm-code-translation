t = int(input())
arr = [int(input()) for _ in range(t)]
prev_winner = 0
for num in arr:
    if num == 1 and prev_winner == 0:
        prev_winner = 2
    if prev_winner in (2, 0):
        if (num - 1) % 2 == 0:
            print(2)
            prev_winner = 2
        else:
            print(1)
            prev_winner = 1
    else:
        if (num - 1) % 2 == 0:
            print(1)
            prev_winner = 1
        else:
            print(2)
            prev_winner = 2
