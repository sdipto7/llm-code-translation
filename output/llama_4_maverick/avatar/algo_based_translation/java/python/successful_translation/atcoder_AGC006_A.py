
class InputReader:
    def __init__(self):
        self.tokens = []

    def next(self):
        if not self.tokens:
            self.tokens = self.read_line().split()[::-1]
        return self.tokens.pop()

    def read_line(self):
        return input().strip()

    def next_int(self):
        return int(self.next())

N = 200 + 10
f = [0] * N
b = [''] * N

def get_fail(b, m):
    j = 0
    f[0] = f[1] = 0
    for i in range(2, m + 1):
        while j > 0 and b[j + 1] != b[i]:
            j = f[j]
        if b[j + 1] == b[i]:
            j += 1
        f[i] = j

def main():
    in_reader = InputReader()
    n = in_reader.next_int()
    s1 = in_reader.next()
    str = in_reader.next()
    cnt = 0
    for i in range(n):
        cnt += 1
        b[cnt] = str[i]
    for i in range(n):
        cnt += 1
        b[cnt] = s1[i]
    get_fail(b, cnt)
    length = min(f[cnt], n)
    print(2 * n - length)

if __name__ == "__main__":
    main()

