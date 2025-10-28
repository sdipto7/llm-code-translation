
import sys
import io

BUFFERSIZE = 512000

class In:
    reader = sys.stdin
    tokenizer = iter([])

    @staticmethod
    def init(input_stream):
        In.reader = input_stream

    @staticmethod
    def next():
        while not In.tokenizer:
            In.tokenizer = iter(In.reader.readline().split())
        return next(In.tokenizer)

    @staticmethod
    def nextInt():
        return int(In.next())

    @staticmethod
    def nextDouble():
        return float(In.next())

    @staticmethod
    def nextLong():
        return int(In.next())

def getValueAtIndex(index):
    return 1 + ((index - 1) * index // 2)

def solve():
    position = In.nextLong()
    nrstSeqStartIndx = 1
    while getValueAtIndex(nrstSeqStartIndx * 2) < position:
        nrstSeqStartIndx *= 2
    while getValueAtIndex(nrstSeqStartIndx + 1) <= position:
        nrstSeqStartIndx += 1
    startIndex = getValueAtIndex(nrstSeqStartIndx)
    print((position - startIndex) + 1)

if __name__ == "__main__":
    In.init(io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8'))
    solve()

