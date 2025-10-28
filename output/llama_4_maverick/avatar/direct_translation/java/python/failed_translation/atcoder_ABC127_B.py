
import sys

class SimpleScanner:
    def __init__(self, file):
        self.file = file
        self.buffer = ''
        self.index = 0

    def _read(self):
        if self.index >= len(self.buffer):
            self.buffer = self.file.readline()
            self.index = 0
        if not self.buffer:
            return ''
        self.index += 1
        return self.buffer
