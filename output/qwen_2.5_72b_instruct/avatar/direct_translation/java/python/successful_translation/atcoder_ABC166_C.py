
import sys
input = sys.stdin.read
data = input().split()

N = int(data[0])
M = int(data[1])
H = list(map(int, data[2:2+N]))
ans = [True] * N

index = 2 + N
for _ in range(M):
    temp1 = int(data[index]) - 1
    temp2 = int(data[index + 1]) - 1
    index += 2
    if H[temp1] < H[temp2]:
        ans[temp1] = False
    elif H[temp1] > H[temp2]:
        ans[temp2] = False
    else:
        ans[temp1] = False
        ans[temp2] = False

ans2 = sum(ans)
print(ans2)

