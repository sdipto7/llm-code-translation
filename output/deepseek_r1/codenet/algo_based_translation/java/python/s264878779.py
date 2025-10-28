
s = input().strip()
n = len(s)
ans = 0

for mask in range(1 << (n - 1)):
    current = s[0]
    for i in range(n - 1):
        if mask & (1 << i):
            current += '+'
        current += s[i + 1]
    ans += sum(int(num) for num in current.split('+'))

print(ans)

