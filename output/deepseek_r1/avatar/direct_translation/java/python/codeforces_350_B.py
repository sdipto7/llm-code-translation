
n = int(input())
a = [0] + list(map(int, input().split()))
b = [0] + list(map(int, input().split()))

num = [0] * (n + 1)
for i in range(1, n+1):
    num[b[i]] += 1

ans = 0
best_ss = ""
st = [False] * (n + 1)

for i in range(1, n+1):
    if a[i] == 1:
        parts = []
        parts.append(" " + str(i)[::-1])
        current_s = 1
        x = b[i]
        st[i] = True
        while x != 0 and not st[x] and num[x] == 1 and a[x] != 1:
            st[x] = True
            parts.append(" " + str(x)[::-1])
            x = b[x]
            current_s += 1
        combined = ''.join(parts)
        reversed_combined = combined[::-1]
        if current_s > ans or (current_s == ans and len(reversed_combined) > len(best_ss)):
            ans = current_s
            best_ss = reversed_combined

print(ans)
print(best_ss)

