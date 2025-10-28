
import sys

class atcoder_ABC107_D:
    def main():
        import sys
        import bisect
        import array

        input = sys.stdin.read
        data = input().split()
        N = int(data[0])
        arr = list(map(int, data[1:]))

        task = Task()
        print(task.solve(arr))

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
            bit = array.array('i', [0] * (2 * n + 2))

            for x in range(n + 1, len(bit)):
                self.add(bit, x, 1)

            for i in range(n):
                cur += 1 if arr[i] <= target else -1
                self.add(bit, cur + n + 1, 1)
                cnt += self.sum(bit, cur + n)

            if cnt >= total // 2 + 1:
                r = mid
            else:
                l = mid + 1

        return sorted_arr[l]

    def add(self, bit, x, val):
        while x < len(bit):
            bit[x] += val
            x += x & -x

    def sum(self, bit, x):
        res = 0
        while x > 0:
            res += bit[x]
            x -= x & -x
        return res

if __name__ == "__main__":
    atcoder_ABC107_D.main()

