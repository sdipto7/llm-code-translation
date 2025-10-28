
import sys

class Main:
    def __init__(self):
        self.in_ = MyInput()

    def run(self):
        Sd = self.in_.next()
        T = self.in_.next()
        count = 0
        ok = False
        first = -1
        end = -1
        for j in range(len(Sd)):
            count = 0
            for i in range(len(Sd) - j):
                c = Sd[i + j]
                if c == '?' or c == T[count]:
                    count += 1
                    if count == len(T):
                        first = i + j - len(T) + 1
                        end = i + j
                        ok = True
                        break
                else:
                    count = 0
        if ok:
            for i in range(len(Sd)):
                if first <= i <= end:
                    print(T[i - first], end='')
                else:
                    if Sd[i] == '?':
                        print('a', end='')
                    else:
                        print(Sd[i], end='')
            print()
        else:
            print("UNRESTORABLE")

class MyInput:
    def __init__(self):
        self.buffer = []
        self.buflen = 0

    def _read(self):
        if self.buflen == 0:
            self.buffer = sys.stdin.read().split()
            self.buflen = len(self.buffer)
        return self.buffer.pop(0)

    def hasNext(self):
        return self.buflen > 0

    def next(self):
        if not self.hasNext():
            raise StopIteration
        return self._read()

    def nextLong(self):
        return int(self.next())

    def nextInt(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

if __name__ == "__main__":
    main = Main()
    main.run()

