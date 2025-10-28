
import sys
from collections import defaultdict

class InputReader:
    def __init__(self, stream):
        self.reader = stream
        self.tokenizer = None
    
    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            try:
                self.tokenizer = sys.stdin.readline().split()
            except:
                raise RuntimeError()
        return self.tokenizer.pop(0)
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())
    
    def nextDouble(self):
        return float(self.next())
    
    def nextLine(self):
        try:
            return sys.stdin.readline().strip()
        except:
            return ""

class Task:
    def solve(self, in_reader, out):
        n = in_reader.nextInt()
        array = [0] * 1001
        for i in range(n):
            index = in_reader.nextInt()
            array[index] += 1
        
        countMax = -1
        for i in range(1, len(array)):
            if countMax < array[i]:
                countMax = array[i]
        
        if n % 2 == 0:
            if countMax <= n // 2:
                out.write("YES\n")
            else:
                out.write("NO\n")
        else:
            if countMax <= n // 2 + 1:
                out.write("YES\n")
            else:
                out.write("NO\n")

def main():
    input_stream = sys.stdin
    output_stream = sys.stdout
    in_reader = InputReader(input_stream)
    solver = Task()
    solver.solve(in_reader, output_stream)
    output_stream.flush()

if __name__ == "__main__":
    main()

