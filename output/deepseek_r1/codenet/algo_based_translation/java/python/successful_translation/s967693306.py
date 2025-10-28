
n, m = map(int, input().split())
constraints = {}

for _ in range(m):
    s, c = map(int, input().split())
    if s in constraints:
        if constraints[s] != c:
            print(-1)
            exit()
    constraints[s] = c

for i in range(1000):
    s = str(i)
    if len(s) != n:
        continue
    valid = True
    for j in range(n):
        pos = j + 1
        current = int(s[j])
        a = pos in constraints and current != constraints[pos]
        b = pos not in constraints and current != 0
        if a or b:
            if b and j == 0 and current == 1:
                continue
            valid = False
            break
    if valid:
        print(s)
        exit()

print(-1)

