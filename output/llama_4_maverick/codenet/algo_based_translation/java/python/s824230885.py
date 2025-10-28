
import sys

class InputIterator:
    def __init__(self):
        self.input_lines = sys.stdin.readlines()
        self.index = 0
        self.max_index = len(self.input_lines)

    def has_next(self):
        return self.index < self.max_index

    def next(self):
        if self.has_next():
            line = self.input_lines[self.index].strip()
            self.index += 1
            return line
        else:
            raise IndexError("No more input")

class Main:
    conv_str = {8: " ", 9: "\n", 0: ""}
    ii = InputIterator()

    @staticmethod
    def next():
        return Main.ii.next()

    @staticmethod
    def has_next():
        return Main.ii.has_next()

    @staticmethod
    def next_int():
        return int(Main.next())

    @staticmethod
    def next_int_array():
        return [int(x) for x in Main.next().split()]

    @staticmethod
    def myout(t):
        print(t)

    @staticmethod
    def solve():
        n = Main.next_int()
        lst = Main.next_int_array()
        max_val = 0
        output = 0
        for i in range(n):
            if max_val <= lst[i]:
                max_val = lst[i]
                output += 1
        Main.myout(output)

    @staticmethod
    def main():
        Main.solve()

if __name__ == "__main__":
    Main.main()

