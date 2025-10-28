
import sys
import math
from typing import List, Optional, Set, Dict

class Main:
    def __init__(self):
        self.sc = self.Scanner(sys.stdin)

    def solve(self):
        H, W = self.sc.nextInt(), self.sc.nextInt()
        c = [[self.sc.nextInt() for _ in range(10)] for _ in range(10)]
        min_cost = [c[i][1] for i in range(10)]
        for _ in range(10):
            for i in range(10):
                for j in range(10):
                    min_cost[i] = min(min_cost[i], c[i][j] + min_cost[j])
        ans = 0
        for _ in range(H):
            for _ in range(W):
                A = self.sc.nextInt()
                if A >= 0:
                    ans += min_cost[A]
        print(ans)

    class Scanner:
        def __init__(self, in_stream):
            self.in_stream = in_stream
            self.buffer = bytearray(1024)
            self.index = 0
            self.length = 0

        def is_printable_char(self, c):
            return 33 <= c <= 126

        def is_digit(self, c):
            return 48 <= c <= 57

        def has_next_byte(self):
            if self.index < self.length:
                return True
            else:
                try:
                    self.length = self.in_stream.readinto(self.buffer)
                    self.index = 0
                except IOError as e:
                    print(e)
                return self.length > 0

        def has_next(self):
            while self.has_next_byte() and not self.is_printable_char(self.buffer[self.index]):
                self.index += 1
            return self.has_next_byte()

        def read_byte(self):
            return self.buffer[self.index] if self.has_next_byte() else -1

        def next(self):
            if not self.has_next():
                raise RuntimeError("no input")
            sb = []
            b = self.read_byte()
            while self.is_printable_char(b):
                sb.append(chr(b))
                b = self.read_byte()
            return ''.join(sb)

        def next_long(self):
            if not self.has_next():
                raise RuntimeError("no input")
            value = 0
            minus = False
            b = self.read_byte()
            if b == 45:
                minus = True
                b = self.read_byte()
            while self.is_printable_char(b):
                if self.is_digit(b):
                    value = value * 10 + (b - 48)
                b = self.read_byte()
            return -value if minus else value

        def next_int(self):
            return int(self.next_long())

        def next_double(self):
            return float(self.next())

if __name__ == '__main__':
    main = Main()
    main.solve()

