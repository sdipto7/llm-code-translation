
def main():
    import sys
    import re

    input = sys.stdin.read().strip()
    x = re.split(r'\s+', input)
    a = int(x[0])
    b = int(x[1])
    c = a - b * 2
    if c < 0:
        c = 0
    print(c)

if __name__ == "__main__":
    main()

