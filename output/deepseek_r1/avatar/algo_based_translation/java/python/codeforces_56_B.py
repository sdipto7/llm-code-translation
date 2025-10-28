
n = int(input())
a = list(map(int, input().split()))
l = 0
r = 0
flag = False
is_true = False

for i in range(n):
    if a[i] != (i + 1) and not flag:
        l = i + 1
        flag = True
        continue
    elif a[i] != (i + 1) and flag:
        r = i + 1
        if r >= 2 and (a[r-1] - a[r-2] > 0):
            is_true = True
            break

print(f"{l} {r}" if not is_true else "0 0")

