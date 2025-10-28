def binary_search(li, start, target):
    low = start
    upp = len(li) - 1
    if upp < low:
        return 0
    if li[start] >= target:
        return 0
    if li[upp] < target:
        return upp - low + 1
    mid = (low + upp) // 2
    while upp - low > 1:
        if li[mid] >= target:
            upp = mid
        else:
            low = mid
        mid = (low + upp) // 2
    return low - start + 1

def main():
    N = int(input())
    L = sorted(map(int, input().split()))
    count = 0
    for i in range(N):
        for j in range(i + 1, N):
            count += binary_search(L, j + 1, L[i] + L[j])
    print(count)

if __name__ == "__main__":
    main()
