
import sys

input = sys.stdin.readline

line = input().strip()
N, M = map(int, line.split())

shortage = [0] * M

for i in range(M):
    line = input().strip()
    A = int(line.split()[0])
    shortage[i] = N - A if N > A else 0

shortage.sort()

ans = sum(shortage[:M-1])

print(ans)

