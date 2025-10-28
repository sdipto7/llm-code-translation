
n = int(input())
print(f"{n} ")
m = n
for i in range(n - 1, 0, -1):
    if m % i == 0:
        print(f"{i} ")
        m = i

