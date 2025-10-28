
import sys

class Main:
    def __init__(self):
        self.sc = sys.stdin.readline

    def next(self):
        return self.sc().strip()

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def split_string(self, s):
        return list(s)

    def split_char(self, s):
        return list(s)

    def char_to_int(self, a):
        return ord(a) - ord('0')

    def max_int(self, a):
        return max(a)

    def min_int(self, a):
        return min(a)

    def max_long(self, a):
        return max(a)

    def min_long(self, a):
        return min(a)

    def main(self):
        n = self.next_long()
        a = self.next_long()
        b = self.next_long()

        sa = abs(a - b)
        ans = 0

        if sa % 2 == 0:
            ans = sa // 2
        else:
            AAA = min(n - a, a - 1)
            BBB = min(n - b, b - 1)
            ans = min(AAA, BBB)
            sa -= 1
            ans += 1
            ans += sa // 2

        print(ans)

if __name__ == "__main__":
    main = Main()
    main.main()

