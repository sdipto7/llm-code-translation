
A, B, n = map(int, input().split())

if A == 0:
    if B == 0:
        print(1)
    else:
        print("No solution")
    exit()

if B % A != 0:
    print("No solution")
    exit()

B_div = B // A
neg = B_div < 0

if neg and n % 2 == 0:
    print("No solution")
    exit()

if neg:
    B_div = -B_div

found = False
for x in range(B_div + 1):
    if x ** n == B_div:
        print(-x if neg else x)
        found = True
        break

if not found:
    print("No solution")

