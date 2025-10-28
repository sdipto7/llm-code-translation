
import sys

def main():
    while True:
        try:
            inputed = sys.stdin.readline().strip()
            if len(inputed) == 1 and inputed == "0":
                break
            ans = sum(int(c) for c in inputed)
            print(ans)
        except Exception as e:
            print(e)

if __name__ == "__main__":
    main()

