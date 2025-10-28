
import sys

class Main:
    def __init__(self):
        self.sc = sys.stdin.readline().strip().split()
        self.index = 0

    def next_int(self):
        return int(self.next())

    def next(self):
        while self.index == len(self.sc):
            self.sc = sys.stdin.readline().strip().split()
            self.index = 0
        self.index += 1
        return self.sc[self.index - 1]

def main():
    main_obj = Main()
    N = main_obj.next_int()
    s = []
    a_num = 0
    b_num = 0
    flag = True
    ans = 0
    for _ in range(N):
        string = main_obj.next()
        s.append(string)
        if string[0] == 'B':
            b_num += 1
        if string[-1] == 'A':
            a_num += 1
        if string[0] == 'B' or string[-1] == 'A':
            if not (string[0] == 'B' and string[-1] == 'A'):
                flag = False
        for j in range(len(string) - 1):
            if string[j:j+2] == 'AB':
                ans += 1
    ans += min(a_num, b_num)
    if min(a_num, b_num) != 0 and flag:
        ans -= 1
    print(ans)

if __name__ == "__main__":
    main()

