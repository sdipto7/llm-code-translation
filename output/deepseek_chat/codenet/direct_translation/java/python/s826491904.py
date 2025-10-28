import sys

def main():
    sc = sys.stdin
    N = int(sc.readline())
    max_num = min_num = int(sc.readline())
    for _ in range(1, N):
        num = int(sc.readline())
        max_num = max(max_num, num)
        min_num = min(min_num, num)
    print(max_num - min_num)

if __name__ == "__main__":
    main()
