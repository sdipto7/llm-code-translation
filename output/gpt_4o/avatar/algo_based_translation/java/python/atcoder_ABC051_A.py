
import sys

def main():
    input_line = sys.stdin.readline().strip()
    result = input_line.replace(',', ' ')
    print(result)

if __name__ == "__main__":
    main()

