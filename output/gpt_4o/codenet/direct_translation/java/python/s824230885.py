
import sys

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

CONVSTR = {8: " ", 9: "\n", 0: ""}
ii = InputIterator()
out = sys.stdout

def flush():
    out.flush()

def myout(t):
    print(t, file=out)

def myerr(t):
    print(f"debug:{t}", file=sys.stderr)

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
    input_ = next_str_array()
    return [int(x) for x in input_]

def next_long_array():
    input_ = next_str_array()
    return [int(x) for x in input_]

def myconv(s, no):
    split_string = CONVSTR[no]
    return s.split(split_string)

def solve():
    N = next_int()
    lst = next_int_array()
    max_ = 0
    output = 0
    for i in range(N):
        if max_ <= lst[i]:
            max_ = lst[i]
            output += 1
    myout(output)

solve()
flush()

