
import sys

class FastReader:
    def __init__(self):
        self.input_stream = sys.stdin

    def next(self):
        return self.input_stream.readline().strip().split()[0]

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.input_stream.readline().strip()

def main():
    in_reader = FastReader()
    a = [0]*4
    for i in range(4):
        a[i] = in_reader.next_long()
    print(max(a[0]*a[2], max(a[1]*a[3], max(a[0]*a[3], a[1]*a[2]))))

if __name__ == "__main__":
    main()

