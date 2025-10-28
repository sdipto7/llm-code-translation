
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    N = int(data[0])
    size = (1 << N)
    S = list(map(int, data[1:size + 1]))
    spawned = [False] * size
    spawned[size - 1] = True
    S.sort()
    active = [S[size - 1]]
    spawned[size - 1] = True
    for _ in range(N):
        active.sort(reverse=True)
        activated = []
        next_index = size - 1
        for slime in active:
            while next_index >= 0 and (S[next_index] >= slime or spawned[next_index]):
                next_index -= 1
            if next_index < 0:
                print("No")
                return
            spawned[next_index] = True
            activated.append(S[next_index])
        active.extend(activated)
    print("Yes")

if __name__ == "__main__":
    main()

