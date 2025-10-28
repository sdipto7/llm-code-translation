
def find(a, b):
    calc = 0
    for x in range(len(a)):
        if a[x] != b[x]:
            calc += 1
    return calc

S = input().strip()
T = input().strip()

min_diff = float('inf')
len_S = len(S)
len_T = len(T)

for i in range(len_S - len_T + 1):
    substring = S[i:i+len_T]
    current = find(substring, T)
    if current < min_diff:
        min_diff = current

print(min_diff if min_diff != float('inf') else len_T)

