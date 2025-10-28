
h, w = map(int, input().split())
ans = []
for _ in range(h):
    s = input().strip()
    ans.append('#' + s + '#')

border = '#' * (w + 2)
print(border)
for line in ans:
    print(line)
print(border)

