
import sys

def main():
    info = [[[0 for _ in range(10)] for _ in range(3)] for _ in range(4)]
    n = int(sys.stdin.readline().strip())
    for _ in range(n):
        built, floor, room, num = map(int, sys.stdin.readline().strip().split())
        info[built - 1][floor - 1][room - 1] += num

    for i in range(4):
        for j in range(3):
            for k in range(10):
                print(info[i][j][k], end=' ')
            print()
        if i != 3:
            print('####################')

if __name__ == "__main__":
    main()

