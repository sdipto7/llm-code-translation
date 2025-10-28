
import sys
from typing import List

class codeforces_334_A:
    @staticmethod
    def main(args: List[str]) -> None:
        in_stream = sys.stdin
        n = int(in_stream.readline().strip())
        square = n * n
        odd = []
        even = []
        for i in range(1, square + 1):
            if i % 2 == 0:
                even.append(i)
            else:
                odd.append(i)
        loop = square // n
        div = loop // 2
        codeforces_334_A.debug(div)
        for i in range(1, loop + 1):
            for j in range(div):
                if i % 2 == 1:
                    print(odd.pop(0), end=' ')
                    print(even.pop(), end=' ')
                else:
                    print(even.pop(0), end=' ')
                    print(odd.pop(), end=' ')
            print()
    
    @staticmethod
    def debug(*obj) -> None:
        print(obj, file=sys.stderr)

if __name__ == '__main__':
    codeforces_334_A.main(sys.argv)

