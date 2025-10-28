
import sys

BUFFERSIZE = 512000

class In:
    def __init__(self, input):
        self.reader = sys.stdin
        self.tokenizer = None
        self.init(input)

    def init(self, input):
        self.reader = input
        self.tokenizer = []

    def next(self):
        while not self.tokenizer:
            self.tokenizer = self.reader.readline().split()
        return self.tokenizer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_long(self):
        return int(self.next())

def get_value_at_index(index):
    return 1 + ((index - 1) * index // 2)

def solve():
    sc = In(sys.stdin)
    position = sc.next_long()
    nrst_seq_start_indx = 1
    while get_value_at_index(nrst_seq_start_indx * 2) < position:
        nrst_seq_start_indx *= 2
    while get_value_at_index(nrst_seq_start_indx + 1) <= position:
        nrst_seq_start_indx += 1
    start_index = get_value_at_index(nrst_seq_start_indx)
    print((position - start_index) + 1)

if __name__ == "__main__":
    solve()

