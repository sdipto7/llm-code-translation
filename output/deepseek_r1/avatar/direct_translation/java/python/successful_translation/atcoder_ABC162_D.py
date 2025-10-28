
n = int(input())
s = input().strip()
rc = s.count('R')
gc = s.count('G')
bc = s.count('B')
result = rc * gc * bc
for i in range(1, n + 1):
    for k in range(i + 1, n + 1):
        if (i + k) % 2 == 0:
            j = (i + k) // 2
            if s[i-1] != s[k-1] and s[k-1] != s[j-1] and s[j-1] != s[i-1]:
                result -= 1
print(result)

