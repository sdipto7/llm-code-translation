
import sys

class Main:
    def __init__(self):
        self.sc = sys.stdin.readline().strip().split(' ')
        self.N = int(self.sc[0])
        self.M = int(self.sc[1])
        self.D = int(self.sc[2])
        self.room = []
        self.num = 0

    def inputRoom(self):
        for _ in range(self.N):
            str_room = sys.stdin.readline().strip()
            self.room.append(list(str_room))

    def setWE(self):
        for i in range(self.N):
            for j in range(self.M - self.D + 1):
                canPut = True
                for k in range(self.D):
                    if self.room[i][j + k] == '#':
                        canPut = False
                        break
                if canPut:
                    self.num += 1

    def setNS(self):
        for i in range(self.M):
            for j in range(self.N - self.D + 1):
                canPut = True
                for k in range(self.D):
                    if self.room[j + k][i] == '#':
                        canPut = False
                        break
                if canPut:
                    self.num += 1

    def run(self):
        self.inputRoom()
        if self.M >= self.D:
            self.setWE()
        if self.N >= self.D:
            self.setNS()
        print(self.num)

if __name__ == "__main__":
    main = Main()
    main.run()

