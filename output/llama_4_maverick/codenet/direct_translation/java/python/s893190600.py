
import sys

class MyInput:
    def __init__(self):
        self.buffer = sys.stdin.buffer.read().decode().split()

    def next_int(self):
        return int(self.buffer.pop(0))

    def next_long(self):
        return int(self.buffer.pop(0))

    def next_double(self):
        return float(self.buffer.pop(0))

    def next_string(self):
        return self.buffer.pop(0)

    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]

    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]

    def next_double_array(self, n):
        return [self.next_double() for _ in range(n)]

    def next_string_array(self, n):
        return [self.next_string() for _ in range(n)]

    def next_int_matrix(self, n, m):
        return [self.next_int_array(m) for _ in range(n)]

    def next_long_matrix(self, n, m):
        return [self.next_long_array(m) for _ in range(n)]

def main():
    in_ = MyInput()
    H = in_.next_int()
    W = in_.next_int()
    C = [['.'] * (W + 2) for _ in range(H + 2)]
    for i in range(H):
        c = in_.next_string()
        for j in range(W):
            C[i + 1][j + 1] = c[j]
    if H == 1 and W == 1:
        print('No')
        return
    for i in range(1, H + 1):
        for j in range(1, W + 1):
            if C[i][j] == '#' and C[i - 1][j] != '#' and C[i + 1][j] != '#' and C[i][j - 1] != '#' and C[i][j + 1] != '#':
                print('No')
                return
    print('Yes')

if __name__ == "__main__":
    main()

