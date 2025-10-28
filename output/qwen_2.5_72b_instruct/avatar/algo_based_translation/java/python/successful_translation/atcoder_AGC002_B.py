
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

def main():
    import sys
    input = sys.stdin.read().split()
    index = 0

    N = int(input[index])
    index += 1
    M = int(input[index])
    index += 1

    B = [Box(1, True)] + [Box(1, False) for _ in range(1, N)]

    for _ in range(M):
        x = int(input[index]) - 1
        index += 1
        y = int(input[index]) - 1
        index += 1
        B[x].move_to(B[y])

    counter = sum(1 for b in B if b.red)
    print(counter)

if __name__ == "__main__":
    main()

