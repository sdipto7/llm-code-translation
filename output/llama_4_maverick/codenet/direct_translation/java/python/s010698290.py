
import sys

class FastReader:
    def __init__(self):
        self.input_stream = sys.stdin

    def next(self):
        return self.input_stream.readline().split()[0]

    def next_int(self):
        return int(self.next())

    def next_long(self):
        return int(self.next())

    def next_double(self):
        return float(self.next())

    def next_line(self):
        return self.input_stream.readline().strip()

def main():
    try:
        s = FastReader()
        n = s.next_int()
        m = s.next_int()
        penal = [0] * (n + 1)
        solved = [False] * (n + 1)

        for _ in range(m):
            num = s.next_int()
            str = s.next()
            if str[0] == 'A':
                solved[num] = True
            elif not solved[num]:
                penal[num] += 1

        correct_ans = sum(1 for x in solved[1:] if x)
        num_penal = sum(penal[i] for i in range(1, n + 1) if solved[i])

        print(correct_ans, num_penal)

    except Exception as e:
        pass

if __name__ == "__main__":
    main()

