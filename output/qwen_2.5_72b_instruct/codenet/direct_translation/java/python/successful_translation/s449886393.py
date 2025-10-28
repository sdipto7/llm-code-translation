import sys

youbi = ["SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"]
s = input().strip()
ans = 0
for i in range(len(youbi)):
    if youbi[i] == s:
        ans = 7 - i
print(ans)
