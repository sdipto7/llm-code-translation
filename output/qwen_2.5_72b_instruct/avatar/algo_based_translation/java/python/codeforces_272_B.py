
import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        while True:
            try:
                line = self.br.readline().strip()
                if line:
                    self.st = iter(line.split())
                    break
            except StopIteration:
                return None
        return next(self.st)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.br.readline().strip()

def rec(x):
    answer = 0
    for k in range(31, -1, -1):
        if x & (1 << k):
            answer += 1
    return answer

def main():
    sc = FastReader()
    out = sys.stdout
    n = sc.nextInt()
    a = [0] * 33
    for _ in range(n):
        a[rec(sc.nextInt())] += 1
    answer = 0
    for i in range(len(a)):
        summ = (1 + a[i] - 1) / 2.0 * (a[i] - 1)
        answer += summ
    out.write(f"{int(answer)}\n")

if __name__ == "__main__":
    main()

