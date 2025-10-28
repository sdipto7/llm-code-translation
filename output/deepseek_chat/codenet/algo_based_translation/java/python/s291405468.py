
import sys

def main():
    input_line = sys.stdin.readline().split()
    A = int(input_line[0])
    B = int(input_line[1])
    if A % 500 <= B:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

