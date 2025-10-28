
import sys

def main():
    N = int(sys.stdin.readline().strip())
    map = []
    for _ in range(N * 2):
        map.append(int(sys.stdin.readline().strip()))
    map.sort()
    max_sum = 0
    for i in range(0, N * 2, 2):
        max_sum += min(map[i], map[i + 1])
    print(max_sum)

if __name__ == "__main__":
    main()

