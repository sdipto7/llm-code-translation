
from sys import stdin

def tr(*os):
    print(*os, file=stdin.stderr)

def main():
    sc = stdin.readline
    while True:
        try:
            line = list(map(int, sc().split()))
        except ValueError:
            break
        if not line:
            break
        my1, my2, enemy1 = line[:3]
        used = [False] * 11
        used[my1] = True
        used[my2] = True
        used[enemy1] = True
        all_count = 0
        safe_count = 0
        for i in range(1, 11):
            if not used[i]:
                all_count += 1
                if my1 + my2 + i <= 20:
                    safe_count += 1
        if safe_count * 2 >= all_count:
            print("YES")
        else:
            print("NO")

def solve(a):
    s = ['d', 'o', 'x']
    for side in range(1, 3):
        for i in range(3):
            if a[i][0] == side and a[i][1] == side and a[i][2] == side:
                return s[side]
            if a[0][i] == side and a[1][i] == side and a[2][i] == side:
                return s[side]
        if a[0][0] == side and a[1][1] == side and a[2][2] == side:
            return s[side]
        if a[0][2] == side and a[1][1] == side and a[2][0] == side:
            return s[side]
    return 'd'

if __name__ == "__main__":
    main()

