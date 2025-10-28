
class FastReader:
    def __init__(self):
        import sys
        self.reader = sys.stdin
        self.tokenizer = None

    def next(self):
        while self.tokenizer is None or not self.tokenizer:
            self.tokenizer = iter(self.reader.readline().split())
        return next(self.tokenizer)

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return int(self.next())

    def nextDouble(self):
        return float(self.next())

    def nextLine(self):
        return self.reader.readline().strip()

def main():
    import sys
    input = sys.stdin
    output = sys.stdout

    s = FastReader()
    n = s.nextInt()
    m = s.nextInt()

    penal = [0] * (n + 1)
    solved = [False] * (n + 1)

    for _ in range(m):
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

    output.write(f"{correct_ans} {num_penal}\n")

if __name__ == "__main__":
    main()

