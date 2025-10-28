
import sys

n = int(sys.stdin.readline().strip())
input_str = sys.stdin.readline().strip()

max_length = -1
msg_lengths = []
count = 0

for i in range(len(input_str)):
    c = input_str[i]
    if c in ['.', '?', '!']:
        msg_lengths.append(count + 1)
        max_length = max(max_length, count + 1)
        count = 0
        i += 1
    else:
        count += 1

if max_length > n:
    print("Impossible")
else:
    ans = 0
    i = 0
    while i < len(msg_lengths):
        l = msg_lengths[i]
        while i < len(msg_lengths) - 1 and l + msg_lengths[i + 1] + 1 <= n:
            l += msg_lengths[i + 1] + 1
            i += 1
        ans += 1
        i += 1
    print(ans)

