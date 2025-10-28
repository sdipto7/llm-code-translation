s = input()
ch = None
for c in reversed(s):
    if c not in (' ', '?'):
        ch = c.lower()
        break
print("YES" if ch in {'a', 'e', 'i', 'o', 'u', 'y'} else "NO")
