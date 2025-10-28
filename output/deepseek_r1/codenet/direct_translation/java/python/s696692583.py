
import sys

for line in sys.stdin:
    my1, my2, enemy1 = map(int, line.strip().split())
    used = [False] * 11
    used[my1] = used[my2] = used[enemy1] = True
    all_cards = 0
    safe = 0
    for i in range(1, 11):
        if not used[i]:
            all_cards += 1
            if my1 + my2 + i <= 20:
                safe += 1
    print("YES" if safe * 2 >= all_cards else "NO")

