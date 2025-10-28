
import sys

def main():
    lines = []
    for line in sys.stdin:
        lines.append(line.strip())

    numlist = lines[0].split()
    Sheep = int(numlist[0])
    Wolves = int(numlist[1])

    if Wolves >= Sheep:
        print("unsafe")
    else:
        print("safe")

if __name__ == "__main__":
    main()

