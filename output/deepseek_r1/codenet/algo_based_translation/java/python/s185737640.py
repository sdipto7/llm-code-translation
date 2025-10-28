
def is_even_string(s):
    mid = len(s) // 2
    return s[:mid] == s[mid:]

S = input().strip()
n = len(S)
if n % 2 == 1:
    S = S[:-1]
else:
    S = S[:-2]

while len(S) > 0:
    if is_even_string(S):
        break
    S = S[:-2]

print(len(S))

