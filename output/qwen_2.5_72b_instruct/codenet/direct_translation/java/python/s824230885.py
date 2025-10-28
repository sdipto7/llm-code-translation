
import sys

class InputIterator:
    def __init__(self):
        self.inputLine = sys.stdin.read().splitlines()
        self.index = 0
        self.max = len(self.inputLine)

    def hasNext(self):
        return self.index < self.max

    def 
