
mod = 1000000007
n, q = map(int, input().split())
c = input()
r = [list(map(int, input().split())) for _ in range(q)]
frag = [0] * (n + 1)
rui = [0] * (n + 1)
for i in range(2, n + 1):
    if c[i - 2] == 'A' and c[i - 1] == 'C':
        frag[i] += 1
    rui[i] = rui[i - 1] + frag[i]
for left, right in r:
    print(rui[right] - rui[left])

