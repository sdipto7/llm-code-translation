n = int(input())
a = list(map(int, input().split()))[:n]
a = sorted(set(a))
found = False
for i in range(len(a) - 2):
    if a[i] + 1 == a[i+1] and a[i+1] + 1 == a[i+2]:
        found = True
        break
print("YES" if found else "NO")
