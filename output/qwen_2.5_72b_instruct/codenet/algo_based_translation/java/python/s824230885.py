
import sys
from typing import List

CONVSTR = {8: " ", 9: "\n", 0: ""}

class InputIterator:
    def __init__(self):
        self.input_line = sys.stdin.read().splitlines()
        self.index = 0
        self.max = len(self.input_line)

    def has_next(self):
        return self.index < self.max

    def next(self):
        if self.has_next():
            result = self.input_line[self.index]
            self.index += 1
            return result
        else:
            raise IndexError("There is no more input")

ii = InputIterator()
out = sys.stdout

def flush():
    out.flush()

def myout(t):
    out.write(str(t) + "\n")

def myerr(t):
    sys.stderr.write("debug:" + str(t) + "\n")

def next():
    return ii.next()

def has_next():
    return ii.has_next()

def next_int():
    return int(next())

def next_long():
    return int(next())

def next_double():
    return float(next())

def next_str_array():
    return myconv(next(), 8)

def next_char_array():
    return myconv(next(), 0)

def next_int_array():
    input = next_str_array()
    ret = [int(x) for x in input]
    return ret

def next_long_array():
    input = next_str_array()
    ret = [int(x) for x in input]
    return ret

def myconv(lst, no):
    join_string = CONVSTR.get(no)
    if isinstance(lst, list):
        return join_string.join(lst)
    else:
        raise TypeError("Don't join")

def myconv_str(s, no):
    split_string = CONVSTR.get(no)
    return s.split(split_string)

def solve():
    N = next_int()
    lst = next_int_array()
    max_val = 0
    output = 0
    for i in range(N):
        if max_val <= lst[i]:
            max_val = lst[i]
            output += 1
    myout(output)

if __name__ == "__main__":
    solve()
    flush()

