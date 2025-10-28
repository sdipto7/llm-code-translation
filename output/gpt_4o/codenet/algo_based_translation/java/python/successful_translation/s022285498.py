
import sys
from threading import Thread
from typing import List
import numpy as np

class Task:
    def solve(self, test_number: int, in_reader, out_writer):
        n = in_reader.next_int()
        count_arr = [0] * (n + 1)
        for x in range(1, 101):
            for y in range(1, 101):
                for z in range(1, 101):
                    value = x * x + y * y + z * z + x * y + x * z + y * z
                    if value > n:
                        break
                    count_arr[value] += 1

        for i in range(1, n + 1):
            out_writer.write(f"{count_arr[i]}\n")

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = iter(self.reader.readline().split())
        return next(self.tokenizer)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

def sort(arr: List[float]):
    arr.sort()

def sort(arr: List[int]):
    arr.sort()

def sort(arr: List[int]):
    arr.sort()

def solve():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    out_writer = output_stream
    task = Task()
    task.solve(1, in_reader, out_writer)

if __name__ == "__main__":
    Thread(target=solve, name="1", args=(), daemon=True).start()

