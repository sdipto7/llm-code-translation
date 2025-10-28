
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
            for i in range(j, len(Sd)):
                c = Sd[i]
                if c == '?' or c == T[count]:
                    count += 1
                    if count == len(T):
                        first = i - len(T) + 1
                        end = i
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
        self.in_ = sys.stdin.read().split()
        self.index = 0

    def hasNext(self):
        return self.index < len(self.in_)

    def next(self):
        if not self.hasNext():
            raise StopIteration
        result = self.in_[self.index]
        self.index += 1
        return result

    def nextLong(self):
        return int(self.next())

    def nextInt(self):
        return self.nextLong()

    def nextDouble(self):
        return float(self.next())

if __name__ == "__main__":
    Main().run()

