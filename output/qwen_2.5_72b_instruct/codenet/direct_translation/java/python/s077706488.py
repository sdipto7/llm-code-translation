import sys

input = sys.stdin.read
data = input().split()

N = int(data[0])
X = int(data[1])
m = [int(data[2])]
X -= m[0]
min_val = m[0]

for i in range(1, N):
    m.append(int(data[2 + i]))
    X -= m[i]
    if m[i] < min_val:
        min_val = m[i]

print(N + X // min_val)
