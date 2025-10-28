
n, k = map(int, input().split())
s = list(map(int, input().split()))

if k == 1:
    print(min(abs(x) for x in s))
elif n != k:
    ans = 10**9
    for i in range(n - k + 1):
        min_val = s[i]
        max_val = s[i + k - 1]
        if min_val < 0 and max_val > 0:
            temp = min(2 * (-min_val) + max_val, (-min_val) + 2 * max_val)
        else:
            temp = max(abs(min_val), abs(max_val))
        ans = min(ans, temp)
    print(ans)
else:
    min_val = s[0]
    max_val = s[-1]
    if min_val < 0 and max_val > 0:
        print(min(2 * (-min_val) + max_val, (-min_val) + 2 * max_val))
    else:
        print(max(abs(min_val), abs(max_val)))

