
import sys

class LightScanner:
    def __init__(self, input_stream):
        self.reader = input_stream
        self.buffer = []
    
    def string(self):
        if not self.buffer:
            line = self.reader.readline().strip()
            if line:
                self.buffer = line.split()
        if self.buffer:
            return self.buffer.pop(0)
        return ""

class PrintWriter:
    def __init__(self, output_stream):
        self.output_stream = output_stream
    
    def println(self, text):
        self.output_stream.write(text + '\n')
        self.output_stream.flush()
    
    def close(self):
        pass

class BUnhappyHackingABCEdit:
    def solve(self, testNumber, in_scanner, out_writer):
        s = in_scanner.string()
        d = []
        for c in s:
            if c == '0':
                d.append('0')
            elif c == '1':
                d.append('1')
            elif c == 'B':
                if len(d) > 0:
                    d.pop()
        out_writer.println(''.join(d))

def main():
    in_scanner = LightScanner(sys.stdin)
    out_writer = PrintWriter(sys.stdout)
    solver = BUnhappyHackingABCEdit()
    solver.solve(1, in_scanner, out_writer)
    out_writer.close()

if __name__ == '__main__':
    main()

