
import sys

def main():
    input_line = sys.stdin.readline().strip()
    str_values = input_line.split(" ")
    h = int(str_values[0])
    a = int(str_values[1])
    num = 0

    while h > 0:
        h -= a
        num += 1

    print(num)

if __name__ == "__main__":
    main()

