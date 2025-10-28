t = int(input())
count = 0
for _ in range(t):
    a, b, c = map(int, input().split())
    if (a and b) or (a and c) or (b and c):
        count += 1
print(count)
