s = input().split(':')
h1, m1 = map(int, s)
t = input().split(':')
h2, m2 = map(int, t)
total = (h1 * 60 + m1 - h2 * 60 - m2) % 1440
print(f"{total // 60:02d}:{total % 60:02d}")
