
class Box:
    def __init__(self, n, r):
        self.num = n
        self.red = r

    def moveTo(self, other):
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
    N, M = map(int, input().split())
    B = [Box(1, True if i == 0 else False) for i in range(N)]
    for _ in range(M):
        x, y = map(int, input().split())
        x -= 1
        y -= 1
        B[x].moveTo(B[y])
    counter = sum(1 for b in B if b.red)
    print(counter)

if __name__ == "__main__":
    main()

