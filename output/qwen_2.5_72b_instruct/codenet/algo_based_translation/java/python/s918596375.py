import sys

class Pair:
    def __init__(self, key, value):
        self.key = key
        self.value = value

    def swap(self):
        return Pair(self.value, self.key)

class FastScanner:
    def __init__(self, input):
        self.input = input
        self.tokenizer = None

    def next(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            self.tokenizer = StringTokenizer(self.input.readline())
        return self.tokenizer.nextToken()

    def nextLine(self):
        if self.tokenizer is None or not self.tokenizer.hasMoreTokens():
            return self.input.readline()
        return self.tokenizer.nextToken("\n")

    def nextLong(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextIntArray(self, n):
        return [self.nextInt() for _ in range(n)]

    def nextLongArray(self, n):
        return [self.nextLong() for _ in range(n)]

class StringTokenizer:
    def __init__(self, line, delimiter=' '):
        self.tokens = line.strip().split(delimiter)
        self.index = 0

    def hasMoreTokens(self):
        return self.index < len(self.tokens)

    def nextToken(self, delimiter=None):
        if delimiter is not None:
            self.tokens = ' '.join(self.tokens[self.index:]).split(delimiter)
            self.index = 0
        token = self.tokens[self.index]
        self.index += 1
        return token

def gcd(a, b):
    if a < b:
        return gcd(b, a)
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return (a * b) // gcd(a, b)

def solve(sc, out):
    s = sc.next().lower()
    vowels = ["a", "e", "i", "o", "u"]
    for str in vowels:
        if str == s:
            out.write("vowel\n")
            return
    out.write("consonant\n")

def main():
    sc = FastScanner(sys.stdin)
    out = sys.stdout
    solve(sc, out)

if __name__ == "__main__":
    main()
