
import sys

def main():
    N = int(sys.stdin.readline())
    size = 1 << N
    S = list(map(int, sys.stdin.readline().split()))
    S.sort()
    spawned = [False] * size
    spawned[-1] = True
    active = [S[-1]]
    
    for _ in range(N):
        active.sort(reverse=True)
        activated = []
        next_idx = size - 1
        for slime in active:
            while next_idx >= 0 and (S[next_idx] >= slime or spawned[next_idx]):
                next_idx -= 1
            if next_idx < 0:
                print("No")
                return
            spawned[next_idx] = True
            activated.append(S[next_idx])
        active.extend(activated)
    
    print("Yes")

if __name__ == "__main__":
    main()

