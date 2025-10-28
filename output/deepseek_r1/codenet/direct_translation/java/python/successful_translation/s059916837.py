
s = input().strip()
t = input().strip()
min_changes = float('inf')
t_len = len(t)
s_len = len(s)
if s_len >= t_len:
    for i in range(s_len - t_len + 1):
        substr = s[i:i+t_len]
        changes = sum(1 for a, b in zip(substr, t) if a != b)
        if changes < min_changes:
            min_changes = changes
print(t_len if min_changes == float('inf') else min_changes)

