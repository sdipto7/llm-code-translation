
t = int(input())
count = [0] * (t + 1)
for _ in range(2, t + 1):
    x = int(input())
    count[x] += 1
for i in range(1, t + 1):
    print(count[i])

