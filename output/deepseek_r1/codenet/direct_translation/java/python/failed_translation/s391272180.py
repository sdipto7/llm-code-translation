Here is the Python code equivalent to the provided Java code:


s = input().strip()
t = input().strip()

if len(s) != len(t):
    print("No")
    exit()

for _ in range(len(s)):
    s = s[1:] + s[0]
    if s == t:
        print("Yes")
        exit()

print("No")

