
class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None
    
    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = input().split()
            except EOFError:
                raise RuntimeError
        return self.tokenizer.pop(0)
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())

def main():
    in_reader = InputReader(None)
    a = in_reader.nextInt()
    b = in_reader.nextInt()
    c = in_reader.nextInt()
    d = in_reader.nextInt()
    if c > b:
        print(0)
    elif a > d:
        print(0)
    elif a < c:
        print(min(b, d) - c)
    else:
        l = [a, b, c, d]
        l.sort()
        print(l[2] - l[1])

main()

