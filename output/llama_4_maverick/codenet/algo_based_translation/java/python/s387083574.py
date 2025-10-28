
import sys

def main():
    N = int(sys.stdin.readline().strip())
    map = {}
    for i in range(1, N + 1):
        map[i] = int(sys.stdin.readline().strip())
    sorted_keys = sorted(map, key=map.get)
    print(' '.join(map(str, sorted_keys)))

if __name__ == "__main__":
    main()

