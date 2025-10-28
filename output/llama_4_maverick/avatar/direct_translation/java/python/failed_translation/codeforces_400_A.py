
import sys

def isSolution(columnsCount, x):
    allXs = [True] * columnsCount
    for i in range(12):
        if x[i] != 'X':
            allXs[i % columnsCount] = False
    return any(allXs)

def main():
    lines = sys.stdin.readlines()
    t = int(lines[0].strip())
    output = []
    for i in range(t):
        s = lines[i + 1].strip()
        possibleSolutions = 0
        solutions = []
        for columnsCount, desc in [(12, '1x12'), (6, '2x6'), (4, '3x4'), (3, '4x3'), (2, '6x2'), (1, '12x1')]:
            if isSolution(columnsCount, s):
                solutions.append(desc)
                possibleSolutions += 1
        output.append(f'{possibleSolutions} {" ".join(solutions)}')
    sys.stdout.write('\n'.join(output))

if __name__ == "__main__":
    main()

