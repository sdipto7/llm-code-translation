def get_points(n, k, l, r, sAll, sk):
    ans = [l] * n
    sAll -= (n - k) * l
    sk -= k * l
    idx = n - 1
    while sk > 0:
        ans[idx] += 1
        sk -= 1
        idx -= 1
    idx = 0
    while sAll > 0:
        ans[idx] += 1
        sAll -= 1
        idx += 1
    return ans

n, k, l, r, sAll, sk = map(int, input().split())
ans = get_points(n, k, l, r, sAll, sk)
print(*ans)
