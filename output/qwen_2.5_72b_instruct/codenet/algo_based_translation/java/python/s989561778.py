
import sys

def main():
    import math
    import io

    input = io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8')
    sc = iter(input.read().split())
    sb = []

    while True:
        try:
            a = int(next(sc))
            b = int(next(sc))
            digit = int(math.log10(a + b)) + 1
            sb.append(str(digit))
            sb.append('\n')
        except StopIteration:
            break

    sys.stdout.write(''.join(sb))

if __name__ == "__main__":
    main()

