
import sys

def main():
    n = int(sys.stdin.readline().strip())
    minN = int(sys.stdin.readline().strip()) - 1
    for _ in range(n - 1):
        h = int(sys.stdin.readline().strip())
        if minN == h:
            minN = h
        elif minN == h - 1:
            minN = h - 1
        elif minN < h - 1:
            minN = h - 1
        elif minN > h:
            print("No")
            return
    print("Yes")

if __name__ == "__main__":
    main()

