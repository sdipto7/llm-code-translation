Here's the Python code equivalent to the provided Java code:


def cal(s, c):
    n = len(s)
    m = n - 1
    ans = 0
    for i in range(n):
        if s[i] == c and (m & i) == i:
            ans ^= 1
    return ans

n = int(input())
s = input().strip()

if n == 1:
    print(s)
else:
    new_s = []
    for i in range(1, n):
        a = int(s[i-1])
        b = int(s[i])
        new_s.append(str(abs(b - a)))
    s_new = ''.join(new_s)
    if n == 2:
        print(s_new[0])
    else:
        if '1' in s_new:
            print(cal(s_new, '1'))
        else:
            print(cal(s_new, '2') * 2)

