
import sys

class Main:
    def __init__(self):
        pass

    def run(self):
        S = input().strip()
        for i in range(len(S) + 1):
            for j in range(i, len(S) + 1):
                begin = S[:i]
                end = S[j:]
                answer = begin + end
                if answer == "keyence" or begin == "keyence" or end == "keyence":
                    print("YES")
                    sys.exit(0)
        print("NO")

if __name__ == "__main__":
    main = Main()
    main.run()

