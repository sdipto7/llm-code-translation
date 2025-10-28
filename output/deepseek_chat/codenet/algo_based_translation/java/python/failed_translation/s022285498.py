
import sys
import threading
from io import BufferedReader
from tokenize import generate_tokens, STRING
from functools import cmp_to_key

def main():
    threading.stack_size(1 << 26)
    thread = threading.Thread(target=solve)
    thread.start()
    thread.join()

def solve():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = PrintWriter(output_stream)
    task = Task()
    task.solve(1, in_reader, out_writer)
    out_writer.close()

class Task:
    def solve(self, testNumber, in_reader, out_writer):
        n = in_reader.next_int()
        count_arr = [0] * (n + 1)
        for x in range(1, 101):
            for y in range(1, 101):
                for z in range(1, 101):
                    value = x*x + y*y + z*z + x*y + x*z + y*z
                    if value > n:
                        break
                    count_arr[value] += 1
        for i in range(1, n + 1):
            out_writer.println(count_arr[i])

def sort_double(arr):
    obj_arr = [float(x) for x in arr]
    obj_arr.sort()
    for i in range(len(arr)):
        arr[i] = obj_arr[i]

def sort_int(arr):
    obj_arr = [int(x) for x in arr]
    obj_arr.sort()
    for i in range(len(arr)):
        arr[i] = obj_arr[i]

def sort_long(arr):
    obj_arr = [int(x) for x in arr]
    obj_arr.sort()
    for i in range(len(arr)):
        arr[i] = obj_arr[i]

class InputReader:
    def __init__(self, stream):
        self.reader = BufferedReader(stream)
        self.tokenizer = None
        self.tokens = []
        self.index = 0

    def next(self):
        while self.index >= len(self.tokens):
            line = self.reader.readline().decode('utf-8')
            if not line:
                return None
            self.tokens = line.split()
            self.index = 0
        token = self.tokens[self.index]
        self.index += 1
        return token

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

class PrintWriter:
    def __init__(self, stream):
        self.stream = stream

    def println(self, obj):
        self.stream.write(str(obj) + '\n')
        self.stream.flush()

    def close(self):
        self.stream.close()

if __name__ == '__main__':
    main()

