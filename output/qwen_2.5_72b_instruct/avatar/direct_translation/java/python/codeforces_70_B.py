
import sys

n = int(sys.stdin.readline())
input = sys.stdin.readline().strip()
max_len = -1
msg_length = [0] * (len(input) // 2)
count = 0
idx = 0

for i in range(len(input)):
    c = input[i]
    if c in '.?!':
        msg_length[idx] = count + 1
        idx += 1
        if count + 1 > max_len:
            max_len = count + 1
        count = 0
        i += 1
    else:
        count += 1

if max_len > n:
    print("Impossible")
else:
    ans = 0
    i = 0
    while i < idx:
        l = msg_length[i]
        while i < idx - 1 and l + msg_length[i + 1] + 1 <= n:
            l += msg_length[i + 1] + 1
            i += 1
        ans += 1
        i += 1
    print(ans)

