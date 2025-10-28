
import sys

def run():
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

def solve(a):
    s = ['d', 'o', 'x']
    for side in [1, 2]:
        for i in range(3):
            if a[i][0] == a[i][1] == a[i][2] == side:
                return s[side]
        for i in range(3):
            if a[0][i] == a[1][i] == a[2][i] == side:
                return s[side]
        if a[0][0] == a[1][1] == a[2][2] == side:
            return s[side]
        if a[0][2] == a[1][1] == a[2][0] == side:
            return s[side]
    return 'd'

if __name__ == "__main__":
    run()

