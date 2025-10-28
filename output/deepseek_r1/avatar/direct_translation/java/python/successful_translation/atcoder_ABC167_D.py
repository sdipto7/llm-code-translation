
N, K = map(int, input().split())
A = list(map(lambda x: int(x)-1, input().split()))
used = set()
idx = [-1] * N
pos = []
next_node = 0
cur = 0

while next_node not in used:
    used.add(next_node)
    idx[next_node] = cur
    pos.append(next_node)
    next_node = A[next_node]
    cur += 1

b = idx[next_node]
a = cur - b

if K < b:
    ans = K
else:
    ans = (K - b) % a + b

print(pos[ans] + 1)

