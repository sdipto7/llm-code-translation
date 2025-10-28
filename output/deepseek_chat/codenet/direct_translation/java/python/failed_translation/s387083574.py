
import sys

def main():
    N = int(sys.stdin.readline())
    d = {i: int(sys.stdin.readline()) for i in range(1, N+1)}
    sorted_keys = sorted(d.keys(), key=lambda x: d[x])
    print(' '.join(map(str, sorted_keys)))

if __name__ == "__main__":
    main()

