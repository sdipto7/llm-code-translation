
import sys

class Main:
    def __init__(self):
        self.score = None
        self.number = None

    def read(self):
        try:
            self.number = int(sys.stdin.readline().strip())
            if self.number == 0:
                return False
            self.score = [int(sys.stdin.readline().strip()) for _ in range(self.number)]
            return True
        except ValueError:
            return False

    def slove(self):
        self.score.sort()
        total_sum = sum(self.score[1:self.number-1])
        print(total_sum // (self.number-2))

def main():
    main_obj = Main()
    while main_obj.read():
        main_obj.slove()

if __name__ == "__main__":
    main()

