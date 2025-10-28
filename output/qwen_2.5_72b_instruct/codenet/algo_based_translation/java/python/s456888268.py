
import sys

def solve():
    tmp = ns()
    s = list(tmp)
    n = len(s)
    ans = 0
    cnt = 0
    for i in range(n):
        if s[i] == 'S':
            cnt += 1
        else:
            if cnt == 0:
                continue
            ans += 1
            cnt -= 1
    print(n - 2 * ans)

def reverse(arr):
    arr.reverse()

def get_reverse(s):
    return s[::-1]

def sbnl():
    print()

def lower_bound(a, x):
    l, r = -1, len(a)
    while r - l > 1:
        c = (l + r) // 2
        if a[c] < x:
            l = c
        else:
            r = c
    return r

def upper_bound(a, x):
    l, r = -1, len(a)
    while r - l > 1:
        c = (l + r) // 2
        if a[c] <= x:
            l = c
        else:
            r = c
    return r

def rlower_bound(a, x):
    l, r = -1, len(a)
    while r - l > 1:
        c = (l + r) // 2
        if a[c] > x:
            l = c
        else:
            r = c
    return r

def rupper_bound(a, x):
    l, r = -1, len(a)
    while r - l > 1:
        c = (l + r) // 2
        if a[c] >= x:
            l = c
        else:
            r = c
    return r

def concat(x, arr):
    return [x] + arr

def max(x, y):
    return x if x > y else y

def min(x, y):
    return x if x < y else y

def sort(arr):
    arr.sort()

def rsort(arr):
    arr.sort(reverse=True)

def fill(arr, x):
    for i in range(len(arr)):
        arr[i] = x

def read_byte():
    global ptrbuf, lenbuf, inbuf
    if lenbuf == -1:
        raise Exception("InputMismatchException")
    if ptrbuf >= lenbuf:
        ptrbuf = 0
        try:
            lenbuf = sys.stdin.buffer.readinto(inbuf)
        except IOError:
            raise Exception("InputMismatchException")
        if lenbuf <= 0:
            return -1
    return inbuf[ptrbuf] & 0xff
    ptrbuf += 1

def is_space_char(c):
    return not (33 <= c <= 126)

def skip():
    b = read_byte()
    while b != -1 and is_space_char(b):
        b = read_byte()
    return b

def ns():
    b = skip()
    sb = []
    while not is_space_char(b):
        sb.append(chr(b))
        b = read_byte()
    return ''.join(sb)

def ni():
    num, b = 0, skip()
    minus = False
    while not (33 <= b <= 57 or b == 45):
        b = read_byte()
    if b == 45:
        minus = True
        b = read_byte()
    while 33 <= b <= 57:
        num = num * 10 + (b - 48)
        b = read_byte()
    return -num if minus else num

def main():
    global is_stdin
    is_stdin = True
    inbuf = bytearray(1024)
    lenbuf = 0
    ptrbuf = 0
    solve()

if __name__ == "__main__":
    main()

