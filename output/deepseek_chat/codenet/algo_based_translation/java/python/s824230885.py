
import sys
import math
from collections import defaultdict

class InputIterator:
    def __init__(self):
        self.inputLine = []
        self.index = 0
        self.max = 0
        try:
            self.inputLine = sys.stdin.read().splitlines()
            self.max = len(self.inputLine)
        except:
            pass
    
    def hasNext(self):
        return self.index < self.max
    
    def next(self):
        if self.hasNext():
            result = self.inputLine[self.index]
            self.index += 1
            return result
        else:
            raise IndexError("There is no more input")

CONVSTR = defaultdict(str)
ii = InputIterator()
out = sys.stdout

def flush():
    out.flush()

def myout(t):
    print(t)

def myerr(t):
    print("debug:", t, file=sys.stderr)

def next():
    return ii.next()

def hasNext():
    return ii.hasNext()

def nextInt():
    return int(next())

def nextLong():
    return int(next())

def nextDouble():
    return float(next())

def nextStrArray():
    return myconv(next(), 8)

def nextCharArray():
    return myconv(next(), 0)

def nextIntArray():
    input_arr = nextStrArray()
    return [int(x) for x in input_arr]

def nextLongArray():
    input_arr = nextStrArray()
    return [int(x) for x in input_arr]

def myconv(obj, no):
    joinString = CONVSTR[no]
    if isinstance(obj, list):
        return joinString.join(map(str, obj))
    elif isinstance(obj, str):
        return obj.split(joinString)
    else:
        raise TypeError("Don't join")

def solve():
    N = nextInt()
    list_arr = nextIntArray()
    max_val = 0
    output = 0
    for i in range(N):
        if max_val <= list_arr[i]:
            max_val = list_arr[i]
            output += 1
    myout(output)

if __name__ == "__main__":
    CONVSTR[8] = " "
    CONVSTR[9] = "\n"
    CONVSTR[0] = ""
    solve()
    flush()

