
def find(li, from_idx, target):
    low = from_idx
    upp = len(li) - 1
    if upp - low < 0:
        return 0
    if li[from_idx] >= target:
        return 0
    if li[upp] < target:
        return upp - low + 1
    while upp - low > 1:
        mid = (low + upp + 1) // 2
        if li[mid] >= target:
            upp = mid
        else:
            low = mid
    return low - from_idx + 1

def main():
    import sys
    data = list(map(int, sys.stdin.read().split()))
    n = data[0]
    l = data[1:n+1]
    l.sort()
    count = 0
    for i in range(n):
        for j in range(i + 1, n):
            res = find(l, j + 1, l[i] + l[j])
            count += res
    print(count)

if __name__ == "__main__":
    main()

