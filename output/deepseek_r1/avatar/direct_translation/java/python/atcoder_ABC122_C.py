
n, q = map(int, input().split())
s = input().strip()
queries = [tuple(map(int, input().split())) for _ in range(q)]

frag = [0] * (n + 1)
rui = [0] * (n + 1)

for i in range(2, n + 1):
    if i >= 2 and s[i - 2] == 'A' and s[i - 1] == 'C':
        frag[i] = 1
    rui[i] = rui[i - 1] + frag[i]

for left, right in queries:
    print(rui[right] - rui[left])

