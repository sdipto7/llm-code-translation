
import sys

class Main:
    def main(self):
        s = sys.stdin.readline().strip()
        for c in s:
            if c.isupper():
                print(c.lower(), end='')
            elif c.islower():
                print(c.upper(), end='')
            else:
                print(c, end='')
        print()
        
if __name__ == "__main__":
    Main().main()

