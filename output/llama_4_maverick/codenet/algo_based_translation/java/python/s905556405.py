
import sys

class Main:
    def main():
        numlist = [0] * 5
        for i in range(5):
            numlist[i] = int(sys.stdin.readline().strip())
        k = int(sys.stdin.readline().strip())
        if (numlist[4] - numlist[0]) > k:
            print(":(")
        else:
            print("Yay!")

if __name__ == "__main__":
    Main.main()

