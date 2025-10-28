
import sys

def main():
    sc = sys.stdin
    N = int(sc.readline().strip())
    size = 1 << N
    S = [0] * size
    spawned = [False] * size
    spawned[size - 1] = True
    for i in range(size):
        S[i] = int(sc.readline().strip())
    S.sort()
    active = []
    active.append(S[size - 1])
    spawned[size - 1] = True
    for i in range(N):
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

