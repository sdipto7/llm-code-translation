import sys

def main():
    N, X = map(int, sys.stdin.readline().split())
    m = [int(sys.stdin.readline()) for _ in range(N)]
    X -= sum(m)
    min_m = min(m)
    print(N + X // min_m)

if __name__ == "__main__":
    main()
