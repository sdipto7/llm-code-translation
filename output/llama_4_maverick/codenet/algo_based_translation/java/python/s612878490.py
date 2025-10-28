
def main():
    line = input().strip().split()
    N, M = int(line[0]), int(line[1])

    shortage = []
    for _ in range(M):
        line = input().strip().split()
        A = int(line[0])
        shortage.append(max(0, N - A))

    shortage.sort()

    ans = sum(shortage[:-1])

    print(ans)

if __name__ == "__main__":
    main()

