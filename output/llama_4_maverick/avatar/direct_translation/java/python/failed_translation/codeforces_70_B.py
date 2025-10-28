
import sys
n = int(sys.stdin.readline().strip())
input_str = sys.stdin.readline().strip()
max_len = -1
msg_length = []
count = 0
for i in range(len(input_str)):
    c = input_str[i]
    if c in ['.', '?', '!']:
        msg_length.append(count + 1)
        if count + 1 > max_len:
            max_len = count + 1
        count = 0
    else:
        count += 1
if max_len > n:
    print('Impossible')
else:
    ans = 0
    i = 0
    while i < len(msg_length):
        l = msg_length[i]
        while i < len(msg_length) - 1 and l + msg_length[i + 1] + 1 <= n:
            l += msg_length[i + 1] + 1
            i += 1
        ans += 1
        i += 1
    print(ans)

