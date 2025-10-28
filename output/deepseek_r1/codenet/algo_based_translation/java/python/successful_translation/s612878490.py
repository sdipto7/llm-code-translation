
n, m = map(int, input().split())
shortage = []
for _ in range(m):
    a = int(input().split(maxsplit=1)[0])
    shortage.append(n - a if n > a else 0)
shortage.sort()
print(sum(shortage[:-1]))

