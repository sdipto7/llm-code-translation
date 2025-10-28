
n = int(input())
a = list(map(int, input().split()))
l = r = 0
flag = is_true = False
for i in range(n):
    if a[i] != i + 1:
        if not flag:
            l = i + 1
            flag = True
        else:
            r = i + 1
            if a[i] - a[i-1] > 0:
                is_true = True
                break
print(f"{l} {r}" if not is_true else "0 0")

