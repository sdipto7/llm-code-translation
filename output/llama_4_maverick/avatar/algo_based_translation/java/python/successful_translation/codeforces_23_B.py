
def max_left(n):
    return n - 2 if n > 2 else 0

for _ in range(int(input())):
    n = int(input())
    print(max_left(n))

