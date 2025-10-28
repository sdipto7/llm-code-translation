
import sys

class Main:
    sc = sys.stdin

    @staticmethod
    def main():
        n = Main.nextLong()
        a = Main.nextLong()
        b = Main.nextLong()

        sa = abs(a - b)
        ans = 0

        if sa % 2 == 0:
            ans = sa // 2
        else:
            AAA = min((n - a), (a - 1))
            BBB = min((n - b), (b - 1))
            ans = min(AAA, BBB)

            sa -= 1
            ans += 1

            ans += sa // 2

        print(ans)

    @staticmethod
    def next():
        return Main.sc.readline().strip()

    @staticmethod
    def nextInt():
        return int(Main.next())

    @staticmethod
    def nextLong():
        return int(Main.next())

    @staticmethod
    def nextDouble():
        return float(Main.next())

    @staticmethod
    def splitString(s):
        return list(s)

    @staticmethod
    def splitChar(s):
        return list(s)

    @staticmethod
    def charToInt(aaa):
        return ord(aaa) - 48

    @staticmethod
    def maxInt(a, lng):
        max_val = a[0]
        for i in range(1, lng):
            max_val = max(max_val, a[i])
        return max_val

    @staticmethod
    def minInt(a, lng):
        min_val = a[0]
        for i in range(1, lng):
            min_val = min(min_val, a[i])
        return min_val

    @staticmethod
    def maxLong(a, lng):
        max_val = a[0]
        for i in range(1, lng):
            max_val = max(max_val, a[i])
        return max_val

    @staticmethod
    def minLong(a, lng):
        min_val = a[0]
        for i in range(1, lng):
            min_val = min(min_val, a[i])
        return min_val

if __name__ == "__main__":
    Main.main()

