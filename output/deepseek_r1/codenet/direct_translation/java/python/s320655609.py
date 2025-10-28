
n = int(input())
constraints = [int(input()) for _ in range(5)]
min_val = min(constraints)
time = (n + min_val - 1) // min_val + 4
print(time)

