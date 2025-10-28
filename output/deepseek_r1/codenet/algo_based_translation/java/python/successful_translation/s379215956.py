
s = input().strip()
a = 0

if s[0] == s[1]:
    a = 1
if s[1] == s[2]:
    a = 1
if s[2] == s[3]:
    a = 1

print("Bad" if a == 1 else "Good")

