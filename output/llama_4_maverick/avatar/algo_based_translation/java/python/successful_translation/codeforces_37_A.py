
import sys

class FastScanner:
    def __init__(self):
        self.it = iter(sys.stdin.read().split())

    def next(self):
        return next(self.it)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return sys.stdin.readline().strip()

def main():
    input = FastScanner()
    n = input.next_int()
    freq_map = {}
    for _ in range(n):
        val = input.next_int()
        freq_map[val] = freq_map.get(val, 0) + 1
    max_freq = max(freq_map.values())
    print(max_freq, len(freq_map))

if __name__ == "__main__":
    main()

