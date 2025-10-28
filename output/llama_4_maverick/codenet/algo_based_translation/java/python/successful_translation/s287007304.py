
import sys

def read_line():
    try:
        return sys.stdin.readline().strip()
    except Exception as e:
        return str(e)

def main():
    line = read_line()
    s = line.split(" ")
    a = int(s[0])
    b = int(s[1])
    if b % a == 0:
        print(a + b)
    else:
        print(b - a)

if __name__ == "__main__":
    main()

