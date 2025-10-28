
import sys
n = int(sys.stdin.readline())
s = sys.stdin.readline().strip()
a = s[:n//2]
if s == a + a:
    print("Yes")
else:
    print("No")

