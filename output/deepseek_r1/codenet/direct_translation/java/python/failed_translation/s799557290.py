a = int(input())
b = int(input())

ju = [False] * 100001
pe = [0] * 100001

for _ in range(b):
    n, res = input().split()
    n = int(n)
    if res == 'WA' and not ju[n-1]:
        pe[n-1] += 1
    elif res == 'AC':
        ju[n-1] = True

ac = sum(ju[i] for i in range(a))
wa = sum(pe[i] for i in range(a) if ju[i])

print(ac, wa)
