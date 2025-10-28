
import sys

class AtCoderABC112A:
    br = None

    @staticmethod
    def main():
        n = int(AtCoderABC112A.read(1)[0])
        if n == 1:
            print("Hello World")
        else:
            strs = AtCoderABC112A.read(2)
            print(int(strs[0]) + int(strs[1]))

    @staticmethod
    def read(len):
        str_list = []
        if AtCoderABC112A.br is None:
            AtCoderABC112A.br = sys.stdin
        for _ in range(len):
            str_list.append(AtCoderABC112A.br.readline().strip())
        return str_list

    @staticmethod
    def close():
        if AtCoderABC112A.br is not None:
            AtCoderABC112A.br.close()

if __name__ == "__main__":
    AtCoderABC112A.main()

