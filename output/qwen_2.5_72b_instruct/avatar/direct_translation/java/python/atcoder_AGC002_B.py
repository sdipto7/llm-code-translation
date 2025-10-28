
import sys

class Box:
    def __init__(self, n, r):
        self.num = n
        self.red = r

    def move_to(self, other):
        if self.num == 0:
            return
        elif self.num == 1:
            self.num = 0
            other.num += 1
            if self.red:
                other.red = True
            self.red = False
        else:
            self.num -= 1
            other.num += 1
            if self.red:
                other.red = True

input = sys.stdin.read().split()
N = int(input[0])
M = int(input[1])
B = [Box(1, True)] + [Box(1, False) for _ in range(1, N)]
index = 2
for _ in range(M):
    x = int(input[index]) - 1
    y = int(input[index + 1]) - 1
    B[x].move_to(B[y])
    index += 2
counter = sum(1 for b in B if b.red)
print(counter)

