
import sys

class Main:
    def __init__(self):
        import sys
        self.sc = sys.stdin

    def solve(self):
        a = self.ni()
        b = self.ni()
        print(max(0, a - 2 * b))

    def ni(self):
        return int(self.sc.readline().strip())

    def nl(self):
        return int(self.sc.readline().strip())

    def nf(self):
        return float(self.sc.readline().strip())

    def nd(self):
        return float(self.sc.readline().strip())

    def ns(self):
        return self.sc.readline().strip()

    def nst(self, s):
        from StringTokenizer import StringTokenizer
        return StringTokenizer(s)

    def ia(self, a):
        a[:] = list(map(int, self.sc.readline().strip().split()))

    def la(self, a):
        a[:] = list(map(int, self.sc.readline().strip().split()))

    def fa(self, a):
        a[:] = list(map(float, self.sc.readline().strip().split()))

    def da(self, a):
        a[:] = list(map(float, self.sc.readline().strip().split()))

    def sa(self, a, empty):
        if empty:
            for i in range(len(a)):
                a[i] = ""
        else:
            for i in range(len(a)):
                a[i] = self.ns()

    def ida(self, a, n, m):
        for i in range(n):
            a[i] = list(map(int, self.sc.readline().strip().split()))

    def lda(self, a, n, m):
        for i in range(n):
            a[i] = list(map(int, self.sc.readline().strip().split()))

    def dda(self, a, n, m):
        for i in range(n):
            a[i] = list(map(float, self.sc.readline().strip().split()))

    def stoi(self, s):
        return int(s)

    def stod(self, s):
        return float(s)

    def lmin(self, a):
        return min(a)

    def imin(self, a):
        return min(a)

    def lmax(self, a):
        return max(a)

    def imax(self, a):
        return max(a)

    def ibs(self, a, toFind):
        a.sort()
        min_index = 0
        max_index = len(a) - 1
        found = False

        while min_index <= max_index and not found:
            mid = min_index + (max_index - min_index) // 2
            if a[mid] == toFind:
                found = True
            elif toFind > a[mid]:
                min_index = mid + 1
            else:
                max_index = mid - 1

        return found

    def lbs(self, a, toFind):
        a.sort()
        min_index = 0
        max_index = len(a) - 1
        found = False

        while min_index <= max_index and not found:
            mid = min_index + (max_index - min_index) // 2
            if a[mid] == toFind:
                found = True
            elif toFind > a[mid]:
                min_index = mid + 1
            else:
                max_index = mid - 1

        return found

    def stb(self, s):
        sum = 0
        k = 0
        for i in range(len(s) - 1, -1, -1):
            sum += int(s[i]) * (2 ** k)
            k += 1
        return sum

if __name__ == "__main__":
    main_instance = Main()
    main_instance.solve()

