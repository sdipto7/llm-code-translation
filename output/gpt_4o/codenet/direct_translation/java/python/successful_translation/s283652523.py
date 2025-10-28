
import sys

MOD = int(1e9 + 7)

def solve():
    N = int(next_token())
    A = next_int_array(N)
    
    ans = 0
    sum = A[N-1]
    for i in range(N - 2, -1, -1):
        ans += (sum * A[i]) % MOD
        ans %= MOD
        sum += A[i]
        sum %= MOD
    print(ans)

def main():
    solve()

class FastScanner:
    def __init__(self, input_stream):
        self.input = input_stream
        self.tokens = iter(self.input.read().split())
    
    def next_token(self):
        return next(self.tokens)
    
    def next_int(self):
        return int(self.next_token())
    
    def next_long(self):
        return int(self.next_token())
    
    def next_double(self):
        return float(self.next_token())
    
    def next_char(self):
        return next(self.tokens)[0]
    
    def next_str(self):
        return self.next_token()
    
    def next_line(self):
        return next(self.tokens)
    
    def next_int_array(self, n):
        return [self.next_int() for _ in range(n)]
    
    def next_long_array(self, n):
        return [self.next_long() for _ in range(n)]
    
    def next_double_array(self, n):
        return [self.next_double() for _ in range(n)]

scanner = FastScanner(sys.stdin)
next_token = scanner.next_token
next_int_array = scanner.next_int_array

if __name__ == "__main__":
    main()

