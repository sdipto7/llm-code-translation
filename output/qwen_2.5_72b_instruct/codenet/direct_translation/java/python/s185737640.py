
import sys

S = sys.stdin.readline().strip()

if len(S) % 2 == 1:
    S = S[:-1]
else:
    S = S[:-2]

while len(S) > 0:
    if S[:len(S)//2] == S[len(S)//2:]:
        break
    S = S[:-2]

print(len(S))

