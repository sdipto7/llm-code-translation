
import sys

class Main:
    def __init__(self):
        self.scanner = sys.stdin.readline

    def next_int(self):
        return int(self.scanner().strip())

    def run(self):
        w, h, n = self.next_int(), self.next_int(), self.next_int()
        x, y, a = [], [], []
        xmax, xmin = w, 0
        ymax, ymin = h, 0

        for _ in range(n):
            x_i, y_i, a_i = self.next_int(), self.next_int(), self.next_int()
            x.append(x_i)
            y.append(y_i)
            a.append(a_i)

            if a_i == 1:
                xmin = max(xmin, x_i)
            elif a_i == 2:
                xmax = min(xmax, x_i)
            elif a_i == 3:
                ymin = max(ymin, y_i)
            elif a_i == 4:
                ymax = min(ymax, y_i)

        w = max(xmax - xmin, 0)
        h = max(ymax - ymin, 0)
        print(w * h)

if __name__ == "__main__":
    main = Main()
    main.run()

