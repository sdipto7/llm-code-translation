import sys
from typing import List

def main():
    import sys
    import bisect
    from typing import List

    input = sys.stdin.read().split()
    N = int(input[0])
    size = 1 << N
    S = list(map(int, input[1:]))
    spawned = [False] * size
    spawned[size - 1] = True

    S.sort()
    active = [S[size - 1]]
    spawned[size - 1] = True

    for _ in range(N):
        active.sort(reverse=True)
        activated = []
        next = size - 1
        for slime in active:
            while next >= 0 and (S[next] >= slime or spawned[next]):
                next -= 1
            if next < 0:
                print("No")
                return
            spawned[next] = True
            activated.append(S[next])
        active.extend(activated)

    print("Yes")

if __name__ == "__main__":
    main()
