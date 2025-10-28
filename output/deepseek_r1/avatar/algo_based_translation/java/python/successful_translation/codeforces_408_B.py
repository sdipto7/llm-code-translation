
from collections import Counter

s1 = input().strip()
s2 = input().strip()

def is_valid(s1, s2):
    chars_s1 = set(s1)
    for c in s2:
        if c not in chars_s1:
            return False
    return True

if not is_valid(s1, s2):
    print(-1)
else:
    count_s1 = Counter(s1)
    count_s2 = Counter(s2)
    ans = 0
    processed = set()
    for char in s2:
        if char not in processed:
            processed.add(char)
            ans += min(count_s1[char], count_s2[char])
    print(ans)

