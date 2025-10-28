
import sys

class Main:
    def __init__(self):
        self.sc = sys.stdin.readline

    def next_int(self):
        return int(self.sc())

    def next_string(self):
        return self.sc().strip()

    def main(self):
        N = self.next_int()
        Q = self.next_int()
        s = self.next_string()
        pre = [0] * (N + 1)
        for i in range(1, N):
            if s[i-1] == 'A' and s[i] == 'C':
                pre[i] = 1
        for i in range(1, N):
            pre[i] += pre[i-1]
        for _ in range(Q):
            l = self.next_int()
            r = self.next_int()
            r -= 1
            print(pre[r] - pre[l-1])

if __name__ == "__main__":
    main = Main()
    main.main()

