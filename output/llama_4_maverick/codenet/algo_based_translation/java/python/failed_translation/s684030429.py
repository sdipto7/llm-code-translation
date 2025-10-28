
import sys
import math
from typing import List

class Main:
    def __init__(self):
        self.sc = sys.stdin.readline

    def ni(self) -> int:
        return int(self.sc().strip())

    def nl(self) -> int:
        return int(self.sc().strip())

    def nf(self) -> float:
        return float(self.sc().strip())

    def nd(self) -> float:
        return float(self.sc().strip())

    def ns(self) -> str:
        return self.sc().strip()

    def nst(self, s: str):
        return s.split()

    def ia(self, n: int) -> List[int]:
        return list(map(int, self.sc().strip().split()))

    def la(self, n: int) -> List[int]:
        return list(map(int, self.sc().strip().split()))

    def fa(self, n: int) -> List[float]:
        return list(map(float, self.sc().strip().split()))

    def da(self, n: int) -> List[float]:
        return list(map(float, self.sc().strip().split()))

    def sa(self, n: int, empty: bool) -> List[str]:
        if empty:
            return [''] * n
        else:
            return [self.sc().strip() for _ in range(n)]

    def ida(self, n: int, m: int) -> List[List[int]]:
        return [list(map(int, self.sc().strip().split())) for _ in range(n)]

    def lda(self, n: int, m: int) -> List[List[int]]:
        return [list(map(int, self.sc().strip().split())) for _ in range(n)]

    def dda(self, n: int, m: int) -> List[List[float]]:
        return [list(map(float, self.sc().strip().split())) for _ in range(n)]

    def stoi(self, s: str) -> int:
        return int(s)

    def stod(self, s: str) -> float:
        return float(s)

    def lmin(self, a: List[int]) -> int:
        return min(a)

    def imin(self, a: List[int]) -> int:
        return min(a)

    def lmax(self, a: List[int]) -> int:
        return max(a)

    def imax(self, a: List[int]) -> int:
        return max(a)

    def ibs(self, a: List[int], toFind: int) -> bool:
        a.sort()
        left, right = 0, len(a) - 1
        while left <= right:
            mid = left + (right - left) // 2
            if a[mid] == toFind:
                return True
            elif toFind > a[mid]:
                left = mid + 1
            else:
                right = mid - 1
        return False

    def lbs(self, a: List[int], toFind: int) -> bool:
        a.sort()
        left, right = 0, len(a) - 1
        while left <= right:
            mid = left + (right - left) // 2
            if a[mid] == toFind:
                return True
            elif toFind > a[mid]:
                left = mid + 1
            else:
                right = mid - 1
        return False

    def stb(self, s: str) -> int:
        return int(s, 2)

    def solve(self):
        a = self.ni()
        b = self.ni()
        print(max(0, a - 2 * b))

def main():
    main_obj = Main()
    main_obj.solve()

if __name__ == "__main__":
    main()

