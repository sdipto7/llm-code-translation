import sys

def main():
    r = int(sys.stdin.readline().strip())

    if r < 1200:
        print("ABC")
        return

    if r < 2800:
        print("ARC")
        return

    print("AGC")

if __name__ == "__main__":
    main()
