N, x = map(int, input().split())
sweet = list(map(int, input().split()))
sweet.sort()
num = 0
for i in range(N):
    if x - sweet[i] >= 0:
        x -= sweet[i]
        num += 1
    else:
        break
if num == N and x > 0:
    num -= 1
print(num)
