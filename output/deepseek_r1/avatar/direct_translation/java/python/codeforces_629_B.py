
n = int(input())
F = [0] * 367
M = [0] * 367
answer = 0
for _ in range(n):
    c, a, b = input().split()
    a = int(a)
    b = int(b)
    for j in range(a, b + 1):
        if c == 'M':
            M[j] += 1
        else:
            F[j] += 1
        current_min = min(M[j], F[j])
        if current_min > answer:
            answer = current_min
print(answer * 2)

