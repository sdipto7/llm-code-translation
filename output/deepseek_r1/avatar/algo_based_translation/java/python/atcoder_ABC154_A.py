
import sys

def main():
    str_line = sys.stdin.readline().split()
    a, b = map(int, sys.stdin.readline().split())
    u = sys.stdin.readline().strip()
    if u == str_line[0]:
        print(f"{a-1} {b}")
    else:
        print(f"{a} {b-1}")

if __name__ == "__main__":
    main()

