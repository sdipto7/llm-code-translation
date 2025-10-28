
n, *rest = map(int, open(0).read().split())
print(len(set(rest[:n])))

