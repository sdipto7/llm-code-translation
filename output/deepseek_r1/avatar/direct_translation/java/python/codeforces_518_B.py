Here is the Python code:


from collections import defaultdict

s = list(input().strip())
t = input().strip()

counter = defaultdict(int)
for c in t:
    counter[c] += 1

ura = 0
for i in range(len(s)):
    c = s[i]
    if counter.get(c, 0) > 0:
        counter[c] -= 1
        ura += 1
        s[i] = None

opa = 0
for i in range(len(s)):
    if s[i] is None:
        continue
    reversed_c = s[i].swapcase()
    if counter.get(reversed_c, 0) > 0:
        counter[reversed_c] -= 1
        opa += 1

print(ura, opa)

