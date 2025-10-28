
n = int(input())
a = sum(int(input()) for _ in range(n))
b = sum(int(input()) for _ in range(n - 1))
c = sum(int(input()) for _ in range(n - 2))
x = a - b
y = b - c
print(x)
print(y)

