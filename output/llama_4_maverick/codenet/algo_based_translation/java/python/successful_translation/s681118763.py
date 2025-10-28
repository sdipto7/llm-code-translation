
import sys

class Main:
    def __init__(self):
        pass

    def main(self):
        c = sys.stdin.readline().strip()
        letter = ord(c[0]) + 1
        print(chr(letter))

if __name__ == "__main__":
    main_obj = Main()
    main_obj.main()

