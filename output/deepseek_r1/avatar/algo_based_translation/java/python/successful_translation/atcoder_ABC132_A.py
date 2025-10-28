
s = input().split()[0]
counts = {}
for char in s:
    counts[char] = counts.get(char, 0) + 1
ok = True
for cnt in counts.values():
    if cnt != 2:
        ok = False
        break
print("Yes" if ok and len(counts) == 2 else "No")

