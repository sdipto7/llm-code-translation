
import sys

class FastReader:
    def __init__(self):
        self._input = sys.stdin.read().split()
        self._index = 0
    
    def next(self):
        result = self._input[self._index]
        self._index += 1
        return result
    
    def nextInt(self):
        return int(self.next())
    
    def nextLong(self):
        return int(self.next())  # Python's int can represent long
    
    def nextDouble(self):
        return float(self.next())

def rec(x):
    answer = 0
    for k in range(31, -1, -1):
        if (x & (1 << k)) != 0:
            answer += 1
    return answer

def main():
    sc = FastReader()
    out = sys.stdout

    n = sc.nextInt()
    a = [0] * 33

    for _ in range(n):
        a[rec(sc.nextInt())] += 1

    answer = 0.0
    for i in range(len(a)):
        summ = (1 + a[i] - 1) / 2.0 * (a[i] - 1)
        answer += summ

    out.write(f"{int(answer)}\n")

if __name__ == "__main__":
    main()

