N, M = map(int, input().split())
H = [int(input()) for _ in range(N)]
ans = [True] * N

for _ in range(M):
    a, b = map(int, input().split())
    a -= 1
    b -= 1
    if H[a] < H[b]:
        ans[a] = False
    elif H[a] > H[b]:
        ans[b] = False
    else:
        ans[a] = False
        ans[b] = False

print(sum(ans))
