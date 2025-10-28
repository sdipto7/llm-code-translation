
import sys

line = sys.stdin.readline().strip()
N, M = map(int, line.split())

shortage = []
for _ in range(M):
    line = sys.stdin.readline().strip()
    A = int(line.split()[0])
    shortage.append(max(N - A, 0))

shortage.sort()

ans = sum(shortage[:-1])

print(ans)

