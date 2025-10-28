
n = int(input())
input_str = input().strip()

msg_length = []
max_len = -1
count = 0
i = 0

while i < len(input_str):
    c = input_str[i]
    if c in ('.', '?', '!'):
        count += 1
        msg_length.append(count)
        if count > max_len:
            max_len = count
        count = 0
        i += 1
    else:
        count += 1
    i += 1

if max_len > n:
    print("Impossible")
else:
    ans = 0
    i = 0
    while i < len(msg_length):
        current = msg_length[i]
        while i < len(msg_length) - 1 and current + msg_length[i+1] + 1 <= n:
            current += msg_length[i+1] + 1
            i += 1
        ans += 1
        i += 1
    print(ans)

