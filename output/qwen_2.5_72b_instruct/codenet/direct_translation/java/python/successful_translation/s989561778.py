import sys
import math

def main():
    input = sys.stdin.read().split()
    i = 0
    result = []
    while i < len(input):
        a = int(input[i])
        b = int(input[i + 1])
        digit = int(math.log10(a + b)) + 1
        result.append(str(digit))
        i += 2
    print('\n'.join(result))

if __name__ == "__main__":
    main()
