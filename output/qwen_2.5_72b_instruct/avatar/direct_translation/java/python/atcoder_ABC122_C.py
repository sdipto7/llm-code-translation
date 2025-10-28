
mod = 1000000007
n = int(input())
q = int(input())
c = input().strip()
range = [[0, 0] for _ in range(q)]
for i in range(q):
    range[i][0] = int(input())
    range[i][1] = int(input())
frag = [0] * (n + 1)
rui = [0] * (n + 1)
for i in range(2, n + 1):
    if c[i - 2] == 'A' and c[i - 1] == 'C':
        frag[i] += 1
    rui[i] = rui[i - 1] + frag[i]
for i in range(q):
    left = range[i][0]
    right = range[i][1]
    print(rui[right] - rui[left])

