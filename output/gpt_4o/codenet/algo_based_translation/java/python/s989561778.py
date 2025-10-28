
import sys
import math

def main():
    sb = []
    for line in sys.stdin:
        if line.strip():
            a, b = map(int, line.split())
            digit = int(math.log10(a + b) + 1)
            sb.append(str(digit))
            sb.append('\n')
    print(''.join(sb))

if __name__ == "__main__":
    main()

