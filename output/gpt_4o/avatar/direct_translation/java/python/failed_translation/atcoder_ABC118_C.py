
def func(a):
    min_val = 0
    i = 0
    while i < len(a):
        if a[i] == 0:
            a.pop(i)
        else:
            if min_val != 0:
                a[i] %= min_val
                if a[i] == 1:
                    print(1)
                    exit(0)
            else:
                min_val = a[i]
            i += 1
    a.sort()
    return a

n = int(input())
a = []

if n == 1:
    print(int(input()))
    exit(0)

for _ in range(n):
    a.append(int(input()))

a.sort()

if a[-1] == 0:
    print(0)
    exit(0)

ans = 0

while True:
    if len(a) == 1:
        ans = a[0]
        break
    a = func(a)

print(ans)

