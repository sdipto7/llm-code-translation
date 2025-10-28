import sys

def main():
    line = sys.stdin.readline()
    N, M = map(int, line.split())
    shortage = []
    for _ in range(M):
        line = sys.stdin.readline()
        A = int(line.split()[0])
        shortage.append(N - A if N > A else 0)
    shortage.sort()
    ans = sum(shortage[:-1])
    print(ans)

if __name__ == "__main__":
    main()
