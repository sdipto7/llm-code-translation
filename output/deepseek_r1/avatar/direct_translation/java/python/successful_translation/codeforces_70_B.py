
n = int(input())
input_str = input().strip()

msg_length = []
max_len = 0
i = 0
current_count = 0

while i < len(input_str):
    c = input_str[i]
    if c in ('.', '?', '!'):
        current_count += 1
        msg_length.append(current_count)
        if current_count > max_len:
            max_len = current_count
        current_count = 0
        i += 2
    else:
        current_count += 1
        i += 1

if max_len > n:
    print("Impossible")
else:
    ans = 0
    i = 0
    while i < len(msg_length):
        current = msg_length[i]
        ans += 1
        while i < len(msg_length) - 1 and current + msg_length[i+1] + 1 <= n:
            current += msg_length[i+1] + 1
            i += 1
        i += 1
    print(ans)

