
import sys

class FastReader:
    def __init__(self):
        self.br = sys.stdin

    def next(self):
        while True:
            try:
                st = next(self.br).strip().split()
                for word in st:
                    yield word
            except StopIteration:
                break

    def nextInt(self):
        return int(self.next().__next__())

    def nextLine(self):
        return self.br.readline().strip()

def main():
    s = FastReader()
    sys.stdout = open(sys.stdout.fileno(), 'w', buffering=1)
    
    n = s.nextInt()
    m = s.nextInt()

    penal = [0] * (n + 1)
    solved = [False] * (n + 1)

    for i in range(m):
        num = s.nextInt()
        str = s.next().__next__()
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

    print(correct_ans, num_penal)

if __name__ == "__main__":
    main()

