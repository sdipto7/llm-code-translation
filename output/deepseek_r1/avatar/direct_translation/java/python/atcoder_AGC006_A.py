
n = int(input())
s1 = input().strip()
str_val = input().strip()

m = 2 * n
b = ['']  
for c in str_val:
    b.append(c)
for c in s1:
    b.append(c)

f = [0] * (m + 1)
j = 0
f[0] = 0
f[1] = 0
for i in range(2, m + 1):
    while j > 0 and b[j + 1] != b[i]:
        j = f[j]
    if b[j + 1] == b[i]:
        j += 1
    f[i] = j

len_val = min(f[m], n)
print(2 * n - len_val)

