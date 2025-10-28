
def is_solution(columns_count, x):
    all_xs = [True] * columns_count
    for i in range(12):
        if x[i] != 'X':
            all_xs[i % columns_count] = False
    return any(all_xs)

def main():
    import sys
    input = sys.stdin.readline
    t = int(input())
    for _ in range(t):
        s = input().strip()
        possible_solutions = 0
        solutions = []
        configurations = [(1, 12), (2, 6), (3, 4), (4, 3), (6, 2), (12, 1)]
        for columns, rows in configurations:
            if is_solution(columns, s):
                possible_solutions += 1
                solutions.append(f'{rows}x{columns}')
        print(possible_solutions, end=' ')
        print(' '.join(solutions))

if __name__ == "__main__":
    main()

