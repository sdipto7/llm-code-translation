
import sys
n = int(sys.stdin.readline())
s = sys.stdin.readline().strip()
rc, gc, bc = 0, 0, 0
for c in s:
    if c == 'R':
        rc += 1
    elif c == 'G':
        gc += 1
    else:
        bc += 1
result = rc * gc * bc
for i in range(1, n + 1):
    for k in range(i + 1, n + 1):
        if (i + k) % 2 == 0:
            js = s
