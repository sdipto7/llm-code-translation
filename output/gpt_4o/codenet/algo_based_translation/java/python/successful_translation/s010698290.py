
import sys

class FastReader:
    def __init__(self):
        self.input = sys.stdin.read
        self.data = self.input().split()
        self.index = 0

    def next(self):
        if self.index < len(self.data):
            result = self.data[self.index]
            self.index += 1
            return result
        return None

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        if self.index < len(self.data):
            line = self.data[self.index]
            self.index += 1
            return line
        return ""

def main():
    s = FastReader()
    w = sys.stdout

    n = s.nextInt()
    m = s.nextInt()

    penal = [0] * (n + 1)
    solved = [False] * (n + 1)

    for i in range(m):
        num = s.nextInt()
        str = s.next()
        if str[0] == 'A':
            solved[num] = True
        else:
            if not solved[num]:
                penal[num] += 1

    correct_ans = 0
    num_penal = 0
    for i in range(1, n + 1):
        if solved[i]:
            correct_ans += 1
            num_penal += penal[i]

    w.write(f"{correct_ans} {num_penal}\n")

if __name__ == "__main__":
    main()

