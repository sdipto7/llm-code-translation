
n = int(input())
a = list(map(int, input().split()))

def is_possible(k):
    s = {}
    current = 0
    for ai in a:
        if ai <= current:
            if k == 1:
                return False
            to_remove = [key for key in s if key >= ai]
            for key in to_remove:
                del s[key]
            p = ai - 1
            while True:
                if p < 0:
                    return False
                s[p] = s.get(p, 0) + 1
                if s[p] == k:
                    del s[p]
                    p -= 1
                else:
                    break
        current = ai
    return True

low, high = 0, n
while high - low > 1:
    mid = (low + high) // 2
    if is_possible(mid):
        high = mid
    else:
        low = mid
print(high)

