
def main():
    scanner = Scanner()

    A = scanner.next_int()

    B = scanner.next_int()

    T = scanner.next_int()

    log((T // A) * B)

def log(value):
    print(value)

class Scanner:
    def __init__(self):
        import sys
        self.input = sys.stdin.read
        self.data = self.input().split()
        self.index = 0

    def next_int(self):
        result = int(self.data[self.index])
        self.index += 1
        return result

if __name__ == "__main__":
    main()

