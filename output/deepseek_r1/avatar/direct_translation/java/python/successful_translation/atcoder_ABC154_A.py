s, t = input().split()
a, b = map(int, input().split())
u = input().strip()
print(f"{a-1} {b}" if u == s else f"{a} {b-1}")
