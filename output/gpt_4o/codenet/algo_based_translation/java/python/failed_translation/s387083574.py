
import sys

def main():
    N = int(sys.stdin.readline().strip())
    map_data = {}

    for i in range(1, N + 1):
        map_data[i] = int(sys.stdin.readline().strip())

    sorted_keys = sorted(map_data, key=lambda k: map_data[k])
    result = " ".join(map(str, sorted_keys))
    print(result)

if __name__ == "__main__":
    main()

