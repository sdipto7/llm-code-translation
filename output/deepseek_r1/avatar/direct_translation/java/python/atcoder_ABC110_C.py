
S = input().strip()
T = input().strip()

for s in 'abcdefghijklmnopqrstuvwxyz':
    if s not in S:
        continue
    s_indices = [i for i, c in enumerate(S) if c == s]
    t_char = T[s_indices[0]]
    for i in s_indices:
        if T[i] != t_char:
            print("No")
            exit()
    t_indices = [i for i, c in enumerate(T) if c == t_char]
    for i in t_indices:
        if S[i] != s:
            print("No")
            exit()
print("Yes")

