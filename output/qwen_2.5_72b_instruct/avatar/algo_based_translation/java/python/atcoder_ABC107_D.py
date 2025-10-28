from bisect import bisect_left

class Task:
    def solve(self, arr):
        n = len(arr)
        sorted_arr = sorted(arr)
        total = n * (n + 1) // 2
        l, r = 0, n - 1
        while l < r:
            mid = l + (r - l) // 2
            target = sorted_arr[mid]
            cur = 0
            cnt = 0
            bit = [0] * (2 * n + 2)
            for x in range(n + 1, len(bit)):
                self.update(bit, x, 1)
            for i in range(n):
                cur += 1 if arr[i] <= target else -1
                self.update(bit, cur + n + 1, 1)
                cnt += self.query(bit, cur + n)
            if cnt >= total // 2 + 1:
                r = mid
            else:
                l = mid + 1
        return sorted_arr[l]

    def update(self, bit, idx, val):
        while idx < len(bit):
            bit[idx] += val
            idx += idx & -idx

    def query(self, bit, idx):
        res = 0
        while idx > 0:
            res += bit[idx]
            idx -= idx & -idx
        return res

def main():
    import sys
    input = sys.stdin.read().split()
    N = int(input[0])
    arr = list(map(int, input[1:N+1]))
    tsk = Task()
    print(tsk.solve(arr))

if __name__ == "__main__":
    main()
