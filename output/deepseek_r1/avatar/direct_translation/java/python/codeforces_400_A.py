
def is_solution(columns_count, x):
    all_xs = [True] * columns_count
    for i in range(12):
        if x[i] != 'X':
            all_xs[i % columns_count] = False
    return any(all_xs)

t = int(input())
for _ in range(t):
    s = input().strip()
    solutions = []
    if is_solution(12, s):
        solutions.append(' 1x12')
    if is_solution(6, s):
        solutions.append(' 2x6')
    if is_solution(4, s):
        solutions.append(' 3x4')
    if is_solution(3, s):
        solutions.append(' 4x3')
    if is_solution(2, s):
        solutions.append(' 6x2')
    if is_solution(1, s):
        solutions.append(' 12x1')
    count = len(solutions)
    print(f"{count}{''.join(solutions)}")

