
import sys

class InputIterator:
    def __init__(self):
        self.input_lines = sys.stdin.read().splitlines()
        self.index = 0
        self.max = len(self.input_lines)

    def has_next(self):
        return self.index < self.max

    def next(self):
        if self.has_next():
            result = self.input_lines[self.index]
            self.index += 1
            return result
        else:
            raise IndexError("There is no more input")


CONVSTR = {}
ii = InputIterator()

def flush():
    sys.stdout.flush()

def myout(t):
    print(t)

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
    input_list = next_str_array()
    return [int(x) for x in input_list]

def next_long_array():
    input_list = next_str_array()
    return [int(x) for x in input_list]

def myconv(input_data, no):
    if no == 8:
        return input_data.split(" ")
    elif no == 0:
        return list(input_data)
    else:
        raise ValueError("Invalid conversion type")

def main():
    CONVSTR[8] = " "
    CONVSTR[9] = "\n"
    CONVSTR[0] = ""

    solve()
    flush()

def solve():
    N = next_int()
    input_list = next_int_array()
    max_value = 0
    output = 0

    for i in range(N):
        if max_value <= input_list[i]:
            max_value = input_list[i]
            output += 1

    myout(output)

if __name__ == "__main__":
    main()

