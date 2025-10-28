
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
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    M = int(data[1])
    
    B = [Box(1, True)] + [Box(1, False) for _ in range(N - 1)]
    
    index = 2
    for _ in range(M):
        x = int(data[index]) - 1
        y = int(data[index + 1]) - 1
        index += 2
        B[x].move_to(B[y])
    
    counter = sum(1 for b in B if b.red)
    print(counter)

if __name__ == "__main__":
    main()

