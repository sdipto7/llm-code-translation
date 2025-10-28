
n = int(input())
a = [0] * (n + 1)
a_input = list(map(int, input().split()))
for i in range(1, n+1):
    a[i] = a_input[i-1]
b = [0] * (n + 1)
b_input = list(map(int, input().split()))
for i in range(1, n+1):
    b[i] = b_input[i-1]
num = [0] * (n + 1)
for i in range(1, n+1):
    num[b[i]] += 1
ss = ""
ans = 0
st = [False] * (n + 1)
for i in range(1, n+1):
    if a[i] == 1:
        st[i] = True
        path = [str(i)]
        x = b[i]
        s = 1
        while x != 0 and not st[x] and num[x] == 1 and a[x] != 1:
            path.append(str(x))
            st[x] = True
            x = b[x]
            s += 1
        if s > ans:
            ans = s
            temp_str = ' ' + ' '.join(path)
            reversed_str = temp_str[::-1]
            ss = reversed_str
print(ans)
print(ss)

