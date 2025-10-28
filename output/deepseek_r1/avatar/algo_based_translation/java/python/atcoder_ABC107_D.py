
import sys

class BIT:
    def __init__(self, size):
        self.size = size
        self.tree = [0] * (self.size + 1)

    def update(self, idx, delta):
        while idx <= self.size:
            self.tree[idx] += delta
            idx += idx & -idx

    def query(self, idx):
        res = 0
        while idx > 0:
            res += self.tree[idx]
            idx -= idx & -idx
        return res

def solve(arr):
    n = len(arr)
    sorted_arr = sorted(arr)
    total = n * (n + 1) // 2
    l, r = 0, n - 1

    while l < r:
        mid = (l + r) // 2
        target = sorted_arr[mid]
        cur = 0
        cnt = 0
        bit = BIT(2 * n + 2)
        bit.update(n + 2, 1)

        for num in arr:
            cur += 1 if num <= target else -1
            update_pos = cur + n + 2
            bit.update(update_pos, 1)
            query_pos = cur + n + 1
            cnt += bit.query(query_pos)

        if cnt >= (total // 2 + 1):
            r = mid
        else:
            l = mid + 1

    return sorted_arr[l]

def main():
    n = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))
    print(solve(arr))

if __name__ == "__main__":
    main()

