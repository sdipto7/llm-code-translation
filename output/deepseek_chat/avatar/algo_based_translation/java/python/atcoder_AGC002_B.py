
import sys

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
    data = sys.stdin.read().split()
    N = int(data[0])
    M = int(data[1])
    
    B = [None] * N
    B[0] = Box(1, True)
    for i in range(1, N):
        B[i] = Box(1, False)
    
    index = 2
    for i in range(M):
        x = int(data[index]) - 1
        y = int(data[index + 1]) - 1
        index += 2
        B[x].moveTo(B[y])
    
    counter = 0
    for b in B:
        if b.red:
            counter += 1
    
    print(counter)

if __name__ == "__main__":
    main()

