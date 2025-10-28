
import sys

class Main:
    def main(self):
        a = int(sys.stdin.readline().strip())
        b = int(sys.stdin.readline().strip())
        c = int(sys.stdin.readline().strip())
        answer = "No"
        if a + b >= c:
            answer = "Yes"
        print(answer)

if __name__ == "__main__":
    Main().main()

