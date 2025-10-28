
import sys

BUFFERSIZE = 512000
sc = sys.stdin.read().split()
out = sys.stdout

def solve():
    position = int(sc[0])
    nrstSeqStartIndx = 1
    while getValueAtIndex(nrstSeqStartIndx * 2) < position:
        nrstSeqStartIndx *= 2
    while getValueAtIndex(nrstSeqStartIndx + 1) <= position:
        nrstSeqStartIndx += 1
    startIndex = getValueAtIndex(nrstSeqStartIndx)
    out.write(str((position - startIndex) + 1) + '\n')

def getValueAtIndex(index):
    return 1 + ((index - 1) * index // 2)

solve()

