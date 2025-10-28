
n = int(input())
k = int(input())
bb = list(map(int, input().split()))
aa = [0] * n
m = 0
for a in reversed(range(n)):
    j = 0
    current_bb = bb[a]
    while current_bb > 0:
        if aa[j] >= a + k:
            current_bb -= 1
        j += 1
    for i in range(m, j, -1):
        aa[i] = aa[i - 1]
    aa[j] = a
    m += 1
print(' '.join(map(lambda x: str(x + 1), aa)))

