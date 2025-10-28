
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    square = n * n
    odd = []
    even = []
    for i in range(1, square + 1):
        if i % 2 == 0:
            even.append(i)
        else:
            odd.append(i)
    loop = square // n
    div = loop // 2
    debug(div)
    result = []
    for i in range(1, loop + 1):
        line = []
        for j in range(div):
            if i % 2 == 1:
                line.append(odd.pop(0))
                line.append(even.pop())
            else:
                line.append(even.pop(0))
                line.append(odd.pop())
        result.append(' '.join(map(str, line)))
    sys.stdout.write('\n'.join(result) + '\n')

def debug(*obj):
    sys.stderr.write(str(obj) + '\n')

if __name__ == "__main__":
    main()

