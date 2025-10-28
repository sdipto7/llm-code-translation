
import sys
import heapq
from collections import deque

class MyScanner:
    def __init__(self, stream):
        self.stream = stream
        self.buffer = bytearray()
        self.pos = 0
        self.buffer_size = 0
    
    def read_byte(self):
        if self.pos < self.buffer_size:
            result = self.buffer[self.pos]
            self.pos += 1
            return result
        try:
            self.buffer = self.stream.read(8192)
            self.buffer_size = len(self.buffer)
            self.pos = 0
            if self.buffer_size == 0:
                return -1
            result = self.buffer[0]
            self.pos = 1
            return result
        except Exception as e:
            raise AssertionError(e)
    
    @staticmethod
    def is_printable_char_except_space(c):
        return 33 <= c <= 126
    
    def next(self):
        c = self.read_byte()
        while c != -1 and not self.is_printable_char_except_space(c):
            c = self.read_byte()
        if c == -1:
            raise EOFError()
        sb = []
        while c != -1 and self.is_printable_char_except_space(c):
            sb.append(chr(c))
            c = self.read_byte()
        return ''.join(sb)
    
    def next_long(self):
        c = self.read_byte()
        while c != -1 and not self.is_printable_char_except_space(c):
            c = self.read_byte()
        if c == -1:
            raise EOFError()
        minus = False
        if chr(c) == '-':
            minus = True
            c = self.read_byte()
        result = 0
        while c != -1 and self.is_printable_char_except_space(c):
            if not chr(c).isdigit():
                raise ValueError()
            result = result * 10 + (c - ord('0'))
            c = self.read_byte()
        return -result if minus else result
    
    def next_int(self):
        n = self.next_long()
        if n < -2147483648 or n > 2147483647:
            raise ValueError()
        return int(n)
    
    def next_double(self):
        return float(self.next())
    
    def next_int_array(self, n):
        result = [0] * n
        for i in range(n):
            result[i] = self.next_int()
        return result
    
    @staticmethod
    def all_same_length_int(a, b, *c):
        if len(a) != len(b):
            return False
        for arr in c:
            if len(a) != len(arr):
                return False
        return True
    
    @staticmethod
    def all_same_length_char(a, b, *c):
        if len(a) != len(b):
            return False
        for arr in c:
            if len(a) != len(arr):
                return False
        return True
    
    def next_vertical_int_arrays(self, a, b, *c):
        if not self.all_same_length_int(a, b, *c):
            raise ValueError()
        for i in range(len(a)):
            a[i] = self.next_int()
            b[i] = self.next_int()
            for arr in c:
                arr[i] = self.next_int()
    
    def next_long_array(self, n):
        result = [0] * n
        for i in range(n):
            result[i] = self.next_long()
        return result
    
    def next_char(self):
        c = self.read_byte()
        while c != -1 and not self.is_printable_char_except_space(c):
            c = self.read_byte()
        if c == -1:
            raise EOFError()
        return chr(c)
    
    def next_char_array(self, n):
        result = [''] * n
        for i in range(n):
            result[i] = self.next_char()
        return result
    
    def next_2d_char_array(self, n, m):
        result = [[''] * m for _ in range(n)]
        for i in range(n):
            for j in range(m):
                result[i][j] = self.next_char()
        return result
    
    def next_vertical_char_arrays(self, a, b, *c):
        if not self.all_same_length_char(a, b, *c):
            raise ValueError()
        for i in range(len(a)):
            a[i] = self.next_char()
            b[i] = self.next_char()
            for arr in c:
                arr[i] = self.next_char()

class MyWriter:
    def __init__(self, stream):
        self.stream = stream
    
    def println(self, x):
        self.stream.write(str(x) + '\n')
    
    def flush(self):
        self.stream.flush()
    
    def join_and_println_int(self, arr, delimiter=' '):
        self.println(delimiter.join(map(str, arr)))
    
    def join_and_println_long(self, arr, delimiter=' '):
        self.println(delimiter.join(map(str, arr)))
    
    def join_and_println_iterable(self, iterable, delimiter=' '):
        self.println(delimiter.join(map(str, iterable)))

def main():
    out = MyWriter(sys.stdout)
    sc = MyScanner(sys.stdin)
    
    N = sc.next_int()
    M = sc.next_int()
    list_arr = [None] * 100001
    
    for _ in range(N):
        a = sc.next_int()
        b = sc.next_int()
        if list_arr[a] is None:
            list_arr[a] = deque()
        list_arr[a].append(b)
    
    res = 0
    pqueue = []
    for i in range(1, M + 1):
        if list_arr[i] is not None:
            for val in list_arr[i]:
                heapq.heappush(pqueue, -val)
        if pqueue:
            res += -heapq.heappop(pqueue)
    
    out.println(res)
    out.flush()

if __name__ == '__main__':
    main()

