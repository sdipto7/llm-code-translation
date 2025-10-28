
def update(bit, x, val):
    while x < len(bit):
        bit[x] += val
        x += x & -x

def query(bit, x):
    sum = 0
    while x > 0:
        sum += bit[x]
        x -= x & -x
    return sum

def main():
    N = int(input())
    arr = list(map(int, input().split()))
    sorted_arr = sorted(arr)
    n = len(arr)
    total = n * (n + 1) // 2
    l, r = 0, n - 1
    while l < r:
        mid = l + (r - l) // 2
        target = sorted_arr[mid]
        cur = 0
        cnt = 0
        bit = [0] * (2 * n + 2)
        update(bit, n + 1, 1)
        for i in range(n):
            cur += 1 if arr[i] <= target else -1
            update(bit, cur + n + 1, 1)
            cnt += query(bit, cur + n)
        if cnt >= total // 2 + 1:
            r = mid
        else:
            l = mid + 1
    print(sorted_arr[l])

if __name__ == "__main__":
    main()

