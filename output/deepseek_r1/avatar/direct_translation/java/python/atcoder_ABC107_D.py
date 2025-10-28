
class BIT:
    def __init__(self, size):
        self.n = size
        self.tree = [0] * (self.n + 1)
    
    def update(self, idx, delta=1):
        while idx <= self.n:
            self.tree[idx] += delta
            idx += idx & -idx
    
    def query(self, idx):
        res = 0
        while idx > 0:
            res += self.tree[idx]
            idx -= idx & -idx
        return res

n = int(input())
arr = list(map(int, input().split()))
sorted_arr = sorted(arr)
total = n * (n + 1) // 2
l, r = 0, n - 1

while l < r:
    mid = (l + r) // 2
    target = sorted_arr[mid]
    cnt = 0
    cur = 0
    bit = BIT(2 * n + 1)
    bit.update(n + 1)
    for num in arr:
        cur += 1 if num <= target else -1
        bit.update(cur + n + 1)
        cnt += bit.query(cur + n)
    if cnt >= (total + 1) // 2:
        r = mid
    else:
        l = mid + 1

print(sorted_arr[l])

