
import sys

class InputReader:
    def __init__(self, stream):
        self.stream = stream
        self.tokenizer = None
        self.buffer_size = 512000
        self.buffer = self.stream.read(self.buffer_size)
        self.index = 0

    def next(self):
        if self.tokenizer is None or not self.tokenizer:
            self.tokenizer = self._next_line_tokenizer()
        return next(self.tokenizer)

    def _next_line_tokenizer(self):
        line = self._next_line()
        return (token for token in line.split())

    def _next_line(self):
        if self.index >= len(self.buffer):
            self.buffer = self.stream.read(self.buffer_size)
            self.index = 0
        line = ''
        while self.index < len(self.buffer):
            char = self.buffer
