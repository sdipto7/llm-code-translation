
import bisect

def main():
    import sys
    N = int(sys.stdin.readline())
    L = list(map(int, sys.stdin.readline().split()))
    L.sort()
    count = 0
    for i in range(N):
        for j in range(i + 1, N):
            a = L[i]
            b = L[j]
            res = find(L, j + 1, a + b)
            count += res
    print(count)

def find(li, from_idx, target):
    low = from_idx
    upp = len(li) - 1
    if upp - low < 0:
        return 0
    if li[from_idx] >= target:
        return 0
    if li[upp] < target:
        return upp - low + 1
    idx = bisect.bisect_left(li, target, low, upp + 1)
    return idx - from_idx

if __name__ == "__main__":
    main()

