
n, k = map(int, input().split())
bb = list(map(int, input().split()))
aa = [0] * n
m = 0

for a in reversed(range(n)):
    current_bb = bb[a]
    j = 0
    while current_bb > 0:
        if aa[j] >= a + k:
            current_bb -= 1
        j += 1
    original_m = m
    m += 1
    for j_ in range(original_m, j, -1):
        aa[j_] = aa[j_ - 1]
    aa[j] = a

print(' '.join(str(x + 1) for x in aa))

