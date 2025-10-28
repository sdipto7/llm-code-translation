
import sys

def main():
    sc = sys.stdin
    run(sc)

def run(sc):
    while True:
        data = sc.readline().split()
        if not data:
            break
        my1 = int(data[0])
        my2 = int(data[1])
        enemy1 = int(data[2])
        used = [False] * 11
        used[my1] = True
        used[my2] = True
        used[enemy1] = True
        all_count = 0
        safe = 0
        for i in range(1, 11):
            if not used[i]:
                all_count += 1
                if my1 + my2 + i <= 20:
                    safe += 1
        if safe * 2 >= all_count:
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

if __name__ == '__main__':
    main()

