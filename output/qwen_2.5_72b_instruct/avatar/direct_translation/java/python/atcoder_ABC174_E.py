
import sys

class atcoder_ABC174_E:
    def main(self):
        input = sys.stdin.read().split()
        n = int(input[0])
        k = int(input[1])
        logsLength = list(map(int, input[2:]))
        min_val = 1
        max_val = 10**9 + 1000
        while min_val < max_val:
            mid = (min_val + max_val) // 2
            if self.nei(mid, logsLength, k):
                max_val = mid
            else:
                min_val = mid + 1
        print(min_val)

    def nei(self, mid, logsLength, k):
        for log in logsLength:
            k -= (log + mid - 1) // mid - 1
        return k >= 0

if __name__ == "__main__":
    atcoder_ABC174_E().main()

