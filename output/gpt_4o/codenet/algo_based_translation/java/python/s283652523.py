
import sys
import io

MOD = int(1e9 + 7)

class FastScanner:
    def __init__(self, stream=sys.stdin):
        self.input = io.TextIOWrapper(stream.buffer, encoding='utf-8')
    
    def close(self):
        try:
            self.input.close()
        except IOError as e:
            print(e, file=sys.stderr)
    
    def next_int(self):
        nl = self.next_long()
        if nl < -2147483648 or nl > 2147483647:
            raise ValueError("Number out of int range")
        return int(nl)
    
    def next_long(self):
        sign = 1
        b = self.input.read(1)
        while not b.isdigit() and b not in '-+':
            b = self.input.read(1)
        if b == '-':
            sign = -1
            b = self.input.read(1)
        elif b == '+':
            b = self.input.read(1)
        ret = int(b)
        while True:
            b = self.input.read(1)
            if not b.isdigit():
                return ret * sign
            ret = ret * 10 + int(b)
    
    def next_double(self):
        sign = 1.0
        b = self.input.read(1)
        while not b.isdigit() and b not in '-+':
            b = self.input.read(1)
        if b == '-':
            sign = -1.0
            b = self.input.read(1)
        elif b == '+':
            b = self.input.read(1)
        ret = float(b)
        while True:
            b = self.input.read(1)
            if not b.isdigit():
                break
            ret = ret * 10 + int(b)
        if b != '.':
            return sign * ret
        div = 1.0
        b = self.input.read(1)
        while b.isdigit():
            ret = ret * 10 + int(b)
            div *= 10
            b = self.input.read(1)
        return sign * ret / div
    
    def next_char(self):
        b = self.input.read(1)
        while b.isspace():
            b = self.input.read(1)
        return b
    
    def next_str(self):
        sb = []
        b = self.input.read(1)
        while b.isspace():
            b = self.input.read(1)
        while b and not b.isspace():
            sb.append(b)
            b = self.input.read(1)
        return ''.join(sb)
    
    def next_line(self):
        sb = []
        b = self.input.read(1)
        while b and b != '\n':
            sb.append(b)
            b = self.input.read(1)
        return ''.join(sb)

    def next_int_array(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.next_int()
        return res
    
    def next_int_array_dec(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.next_int() - 1
        return res
    
    def next_int_array_1_index(self, n):
        res = [0] * (n + 1)
        for i in range(n):
            res[i + 1] = self.next_int()
        return res

    def next_long_array(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.next_long()
        return res
    
    def next_long_array_dec(self, n):
        res = [0] * n
        for i in range(n):
            res[i] = self.next_long() - 1
        return res
    
    def next_long_array_1_index(self, n):
        res = [0] * (n + 1)
        for i in range(n):
            res[i + 1] = self.next_long()
        return res
    
    def next_double_array(self, n):
        res = [0.0] * n
        for i in range(n):
            res[i] = self.next_double()
        return res

class Main:
    def solve(self):
        N = self.inp.next_int()
        A = self.inp.next_int_array(N)
        
        ans = 0
        sum = A[N - 1]
        for i in range(N - 2, -1, -1):
            ans = (ans + (sum * A[i]) % MOD) % MOD
            sum = (sum + A[i]) % MOD
        
        self.out.write(str(ans) + '\n')
    
    def __init__(self):
        self.inp = FastScanner(sys.stdin)
        self.out = sys.stdout
        self.solve()
        self.out.flush()
        self.inp.close()

if __name__ == "__main__":
    Main()

