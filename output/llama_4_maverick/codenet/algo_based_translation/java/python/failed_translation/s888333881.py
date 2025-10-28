
import sys

class FastScanner:
    def __init__(self):
        self.input_stream = sys.stdin
        self.buffer = bytearray(1024)
        self.ptr = 0
        self.buflen = 0

    def has_next_byte(self):
        if self.ptr < self.buflen:
            return True
        else:
            self.ptr = 0
            try:
                self.buflen = self.input_stream.readinto(self.buffer)
            except IOError as e:
                print(e, file=sys.stderr)
            if self.buflen <= 0:
                return False
        return True

    def read_byte(self):
        if self.has_next_byte():
            return self.buffer[self.ptr]
        else:
            return -1

    @staticmethod
    def is_printable_char(c):
        return 33 <= c <= 126

    def has_next(self):
        while self.has_next_byte() and not self.is_printable_char(self.buffer[self.ptr]):
            self.ptr += 1
        return self.has_next_byte()

    def next(self):
        if not self.has_next():
            raise StopIteration
        sb = bytearray()
        b = self.read_byte()
        self.ptr += 1
        while self.is_printable_char(b):
            sb.append(b)
            b = self.read_byte()
            self.ptr += 1
        return sb.decode('utf-8')

    def next_int(self):
        if not self.has_next():
            raise StopIteration
        n = 0
        minus = False
        b = self.read_byte()
        self.ptr += 1
        if b == ord('-'):
            minus = True
            b = self.read_byte()
            self.ptr += 1
        if b < ord('0') or ord('9') < b:
            raise ValueError
        while True:
            if ord('0') <= b <= ord('9'):
                n *= 10
                n += b - ord('0')
            elif b == -1 or not self.is_printable_char(b) or b == ord(':'):
                return -n if minus else n
            else:
                raise ValueError
            b = self.read_byte()
            self.ptr += 1

def pow10_e97(ob, soeji, p):
    if ob == 0:
        return 0
    if soeji == 0:
        return 1
    if soeji == 2:
        return (ob * ob) % p

    d = get_digit2(soeji)
    ob_pow_2pow = [0] * d

    ob_pow_2pow[0] = ob
    for i in range(1, d):
        ob_pow_2pow[i] = (ob_pow_2pow[i - 1] * ob_pow_2pow[i - 1]) % p

    ans = 1
    for i in range(d - 1, -1, -1):
        if soeji >= (1 << i):
            soeji -= (1 << i)
            ans = (ans * ob_pow_2pow[i]) % p
    return ans % p

def get_digit2(num):
    cf = 1
    d = 0
    while num >= cf:
        d += 1
        cf = (1 << d)

    return d

def count_flaged(bit):
    ans = 0
    for i in range(get_digit2(bit)):
        if (bit & (1 << i)) > 0:
            ans += 1
    return ans

def fill(ob, res):
    for i in range(len(ob)):
        ob[i] = res

def main():
    sc = FastScanner()
    n = sc.next_int()
    s = sc.next()
    flaged = [False] * n
    fill(flaged, False)

    pop1st = 0
    for i in range(n):
        if s[i] == '1':
            flaged[i] = True
            pop1st += 1

    surp1 = 0
    for i in range(n):
        surp1 *= 2
        if flaged[i]:
            surp1 += 1
        surp1 %= (pop1st + 1)

    surp9 = 0
    if pop1st > 1:
        for i in range(n):
            surp9 *= 2
            if flaged[i]:
                surp9 += 1
            surp9 %= (pop1st - 1)

    for p in range(n):
        if flaged[p]:
            if pop1st == 1:
                print(0)
                continue
            dw = surp9

            dif = pow10_e97(2, n - p - 1, pop1st - 1)
            dw -= dif
            dw += (pop1st - 1)
            dw %= (pop1st - 1)

            ans = 1
            while dw != 0:
                count = count_flaged(dw)
                dw %= count
                ans += 1
            print(ans)
        else:
            dw = surp1

            dif = pow10_e97(2, n - p - 1, pop1st + 1)
            dw += dif
            dw %= (pop1st + 1)

            ans = 1
            while dw != 0:
                count = count_flaged(dw)
                dw %= count
                ans += 1
            print(ans)

if __name__ == "__main__":
    main()

