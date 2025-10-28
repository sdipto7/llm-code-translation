
import sys

class AtCoderABC112A:
    def __init__(self):
        self.br = None

    def main(self):
        n = int(self.read(1)[0])
        if n == 1:
            print("Hello World")
        else:
            strs = self.read(2)
            print(int(strs[0]) + int(strs[1]))

    def read(self, length):
        if self.br is None:
            self.br = sys.stdin
        str_list = []
        for _ in range(length):
            str_list.append(self.br.readline().strip())
        return str_list

    def close(self):
        if self.br is not None:
            self.br.close()

if __name__ == "__main__":
    app = AtCoderABC112A()
    app.main()
    app.close()

