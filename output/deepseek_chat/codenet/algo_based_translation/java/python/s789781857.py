
n = int(input().strip())
c = [0] * (n - 1)
s = [0] * (n - 1)
f = [0] * (n - 1)

for i in range(n - 1):
    data = input().split()
    c[i] = int(data[0])
    s[i] = int(data[1])
    f[i] = int(data[2])

for i in range(n - 1):
    time = s[i] + c[i]
    for j in range(i + 1, n - 1):
        if time % f[j] != 0:
            time += f[j] - (time % f[j])
        if time < s[j]:
            time = s[j]
        time += c[j]
    print(time)

print(0)

