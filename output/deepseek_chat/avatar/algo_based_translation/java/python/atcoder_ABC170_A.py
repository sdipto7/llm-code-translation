
import sys

def main():
    input_line = sys.stdin.readline().strip()
    input_array = input_line.split()
    result = 0
    for s in input_array:
        result += 1
        if s == "0":
            break
    print(result)

if __name__ == "__main__":
    main()

