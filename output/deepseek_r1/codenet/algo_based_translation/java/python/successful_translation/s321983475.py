
w, a, b = map(int, input().split())
ans = abs(a - b) - w
print(0 if ans < 0 else ans)

