n = int(input())
h = []
for i in range(n):
    h.append(int(input()))

ans = 0
out = 0

for height in h:
    if out < height:
        ans += height - out
        out = height
    else:
        out = height

print(ans)
