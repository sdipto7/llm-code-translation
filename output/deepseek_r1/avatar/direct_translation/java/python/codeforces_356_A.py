
import bisect

n = int(input())
left = list(range(n))
answer = [0] * n
q = int(input())

for _ in range(q):
    l, r, win = map(int, input().split())
    l -= 1
    r -= 1
    win_idx = win - 1

    start = bisect.bisect_left(left, l)
    end = bisect.bisect_right(left, r)
    to_remove = left[start:end]
    del left[start:end]
    
    for x in to_remove:
        answer[x] = win
    
    answer[win_idx] = 0
    pos = bisect.bisect_left(left, win_idx)
    if pos >= len(left) or left[pos] != win_idx:
        left.insert(pos, win_idx)

print(' '.join(map(str, answer)))

