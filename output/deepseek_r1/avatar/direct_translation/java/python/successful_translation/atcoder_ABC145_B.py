n = int(input())
s = input().strip()
half = n // 2
a = s[:half]
print("Yes" if s == a + a else "No")
