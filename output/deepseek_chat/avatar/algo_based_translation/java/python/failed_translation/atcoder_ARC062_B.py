
import sys
from io import BufferedReader, InputStreamReader
from java.io import InputStream, OutputStream, IOException
from java.util import StringTokenizer
from java.lang import RuntimeException

class InputReader:
    def __init__(self, stream):
        self.reader = BufferedReader(InputStreamReader(stream), 32768)
        self.tokenizer = None
    
    def next(self):
        while self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            try:
                self.tokenizer = StringTokenizer(self.readLine())
            except IOException as e:
                raise RuntimeException(e)
        return self.tokenizer.nextToken()
    
    def readLine(self):
        return self.reader.readLine()

class TaskD:
    def solve(self, testNumber, in_, out):
        S = in_.next()
        score = 0
        for i in range(len(S)):
            my = 'g' if i % 2 == 0 else 'p'
            his = S[i]
            if my != his:
                if my == 'p':
                    score += 1
                else:
                    score -= 1
        out.println(score)

def main(args):
    inputStream = sys.stdin
    outputStream = sys.stdout
    in_ = InputReader(inputStream)
    out = PrintWriter(outputStream)
    solver = TaskD()
    solver.solve(1, in_, out)
    out.close()

if __name__ == '__main__':
    main(sys.argv)

