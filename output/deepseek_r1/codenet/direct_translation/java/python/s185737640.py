
def is_even_string(s):
    half = len(s) // 2
    return s[:half] == s[half:]

S = input().strip()
n = len(S)
if n % 2 == 1:
    S = S[:n-1]
else:
    S = S[:n-2]

while len(S) > 0:
    if is_even_string(S):
        break
    S = S[:-2]

print(len(S))

