
n = int(input())
c = 0
flg = 0
for _ in range(n):
    x, y = map(int, input().split())
    if x == y:
        c += 1
        if c >= 3:
            flg = 1
    else:
        c = 0
print("Yes" if flg else "No")

