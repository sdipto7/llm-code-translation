
import sys

def cal(s, c):
    n = len(s)
    m = n - 1
    ans = 0
    for i in range(n):
        if s[i] == c and (i & m) == i:
            ans ^= 1
    return ans

def solve():
    n = int(sys.stdin.readline())
    s = sys.stdin.readline().strip()
    if n == 1:
        print(0)
        return
    sb = []
    for i in range(1, n):
        diff = abs(ord(s[i]) - ord(s[i-1]))
        sb.append(str(diff))
    s_diff = ''.join(sb)
    if n == 2:
        print(s_diff[0])
        return
    if '1' in s_diff:
        print(cal(s_diff, '1'))
    else:
        print(cal(s_diff, '2') * 2)

if __name__ == "__main__":
    solve()

