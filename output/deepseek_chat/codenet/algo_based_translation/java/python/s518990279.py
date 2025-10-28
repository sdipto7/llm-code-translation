
import sys

def main():
    while True:
        inputed = sys.stdin.readline().strip()
        if len(inputed) == 1 and inputed == "0":
            break
        ans = 0
        for i in range(len(inputed)):
            ans += int(inputed[i])
        print(ans)

if __name__ == "__main__":
    main()

