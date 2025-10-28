import sys

class Main:
    buf = None
    
    @staticmethod
    def main(args):
        abc = [0] * 3
        str_input = ""
        inp = []
        Main.buf = sys.stdin
        str_input = Main.buf.readline().strip()
        inp = str_input.split(" ", -1)
        for i in range(len(inp)):
            abc[i] = int(inp[i])
        if abc[0] < abc[1] and abc[1] < abc[2]:
            print("Yes")
        else:
            print("No")

if __name__ == "__main__":
    Main.main(sys.argv)
