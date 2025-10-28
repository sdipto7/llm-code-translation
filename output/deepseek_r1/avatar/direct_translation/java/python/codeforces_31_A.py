n = int(input())
a = list(map(int, input().split()))
found = False
res = []
for k in range(n):
    t = a[k]
    for i in range(n):
        for j in range(n-1):
            if i != j and t == a[i] + a[j]:
                res = [k+1, j+1, i+1]
                found = True
                break
        if found:
            break
    if found:
        break
print(' '.join(map(str, res)) if found else -1)
