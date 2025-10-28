
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream

    def next(self):
        return self.stream.readline().strip()

    def next_int(self):
        return int(self.next())

def get_fail(b, m):
    f = [0] * (m + 1)
    j = 0
    f[0] = f[1] = 0
    for i in range(2, m + 1):
        while j > 0 and b[j] != b[i - 1]:
            j = f[j]
        if b[j] == b[i - 1]:
            j += 1
        f[i] = j
    return f

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    reader = InputReader(input_stream)
    n = reader.next_int()
    s1 = reader.next()
    s2 = reader.next()
    b = list(s2 + s1)
    f = get_fail(b, len(b))
    length = min(f[-1], n)
    output_stream.write(str(2 * n - length) + '\n')

if __name__ == "__main__":
    main()

