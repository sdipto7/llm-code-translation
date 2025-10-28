
import sys
import threading

BUFFERSIZE = 512000

def getValueAtIndex(index):
    return 1 + ((index - 1) * index // 2)

def solve():
    position = int(sys.stdin.readline())
    nrstSeqStartIndx = 1
    
    while getValueAtIndex(nrstSeqStartIndx * 2) < position:
        nrstSeqStartIndx *= 2
        
    while getValueAtIndex(nrstSeqStartIndx + 1) <= position:
        nrstSeqStartIndx += 1
        
    startIndex = getValueAtIndex(nrstSeqStartIndx)
    print((position - startIndex) + 1)

def main():
    solve()

threading.Thread(target=main).start()

