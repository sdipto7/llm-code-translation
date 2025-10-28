Here is the Python code translated from the provided Java code:


s = input().strip()
n = len(s)
total = 0
for mask in range(2 ** (n - 1)):
    current = s[0]
    for i in range(n - 1):
        if (mask >> i) & 1:
            current += '+' + s[i + 1]
        else:
            current += s[i + 1]
    parts = current.split('+')
    total += sum(int(part) for part in parts)
print(total)

