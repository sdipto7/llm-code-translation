
import sys

class MyInput:
    def __init__(self):
        self.buffer = sys.stdin.read().split()

    def next(self):
        return self.buffer.pop(0)

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

def main():
    in_ = MyInput()
    Sd = in_.next()
    T = in_.next()
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
        result = ''
        for i in range(len(Sd)):
            if first <= i <= end:
                result += T[i - first]
            else:
                if Sd[i] == '?':
                    result += 'a'
                else:
                    result += Sd[i]
        print(result)
    else:
        print('UNRESTORABLE')

if __name__ == "__main__":
    main()

