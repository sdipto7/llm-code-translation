
def main():
    import sys
    nums = sys.stdin.readline().split()
    N = int(nums[0])
    M = int(nums[1])
    D = int(nums[2])
    room = []
    for _ in range(N):
        line = sys.stdin.readline().strip()
        room.append(list(line))
    num = 0

    def setWE():
        nonlocal num
        for i in range(N):
            for j in range(M - D + 1):
                can_put = True
                for k in range(D):
                    if room[i][j + k] == '#':
                        can_put = False
                        break
                if can_put:
                    num += 1

    def setNS():
        nonlocal num
        for i in range(M):
            for j in range(N - D + 1):
                can_put = True
                for k in range(D):
                    if room[j + k][i] == '#':
                        can_put = False
                        break
                if can_put:
                    num += 1

    if M >= D:
        setWE()
    if N >= D:
        setNS()
    print(num)

if __name__ == "__main__":
    main()

