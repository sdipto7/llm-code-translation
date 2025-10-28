
import sys

class Main:
    def main(self):
        while True:
            sum_val = 0
            s = sys.stdin.readline().strip()
            if s == "0":
                break
            for i in range(len(s)):
                a = s[i]
                sum_val += ord(a) - ord('0')
            print(sum_val)

if __name__ == "__main__":
    Main().main()

