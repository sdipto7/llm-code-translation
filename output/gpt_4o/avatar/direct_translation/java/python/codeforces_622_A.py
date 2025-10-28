
import sys

BUFFERSIZE = 512000

def solve():
    position = int(sys.stdin.readline().strip())
    nrstSeqStartIndx = 1
    while getValueAtIndex(nrstSeqStartIndx * 2) < position:
        nrstSeqStartIndx *= 2
    while getValueAtIndex(nrstSeqStartIndx + 1) <= position:
        nrstSeqStartIndx += 1
    startIndex = getValueAtIndex(nrstSeqStartIndx)
    sys.stdout.write(str((position - startIndex) + 1) + '\n')

def getValueAtIndex(index):
    return 1 + ((index - 1) * index // 2)

if __name__ == "__main__":
    solve()

