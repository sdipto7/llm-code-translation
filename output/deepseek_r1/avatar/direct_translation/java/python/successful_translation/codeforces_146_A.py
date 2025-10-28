n = int(input())
s = input().strip()
if any(c not in {'4', '7'} for c in s):
    print("NO")
else:
    half = n // 2
    x = sum(int(c) for c in s[:half])
    y = sum(int(c) for c in s[- (n - half):])
    print("YES" if x == y else "NO")
