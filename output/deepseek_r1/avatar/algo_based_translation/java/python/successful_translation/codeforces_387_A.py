
s = input().split(':')
t = input().split(':')
x_total = int(s[0]) * 60 + int(s[1])
y_total = int(t[0]) * 60 + int(t[1])
diff = (x_total - y_total) % 1440
print(f"{diff // 60:02d}:{diff % 60:02d}")

