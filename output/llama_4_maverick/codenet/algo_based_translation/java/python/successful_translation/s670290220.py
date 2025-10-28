
import sys

class Main:
    def main(self):
        N = int(sys.stdin.readline().strip())
        c = list(sys.stdin.readline().strip())
        for i in range(len(c)):
            c[i] = chr((ord(c[i]) - ord('A') + N) % 26 + ord('A'))
        print(''.join(c))

if __name__ == "__main__":
    Main().main()

