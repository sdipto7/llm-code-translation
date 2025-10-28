
import sys

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in = InputReader(input_stream)
    out = PrintWriter(output_stream)
    solver = Task()
    solver.solve(in, out)
    out.close()

class Task:
    def solve(self, in, out):
        n = in.next_int()
        array = [0] * 1001
        for _ in range(n):
            index = in.next_int()
            array[index] += 1
        count_max = -1
        for i in range(1, len(array)):
            if count_max < array[i]:
                count_max = array[i]
        if n % 2 == 0:
            if count_max <= n // 2:
                out.println("YES")
            else:
                out.println("NO")
        else:
            if count_max <= n // 2 + 1:
                out.println("YES")
            else:
                out.println("NO")

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = sys.stdin.readline().split()
            except:
                raise RuntimeError()
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        try:
            return sys.stdin.readline()
        except:
            raise RuntimeError()

class PrintWriter:
    def __init__(self, stream):
        self.stream = stream

    def println(self, text):
        self.stream.write(text + '\n')

    def close(self):
        self.stream.flush()

if __name__ == "__main__":
    main()

