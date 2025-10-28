
import sys

def main():
    try:
        w, a, b = map(int, sys.stdin.readline().split())
        answer = max(a, b) - min(a, b) - w
        if answer < 0:
            print(0)
        else:
            print(answer)
    except Exception as e:
        pass

if __name__ == "__main__":
    main()

