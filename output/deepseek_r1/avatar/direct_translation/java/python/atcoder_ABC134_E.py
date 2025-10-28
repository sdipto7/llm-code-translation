
import bisect

n = int(input())
nums = [int(input()) for _ in range(n)]
ends = []
counts = {}

for num in nums:
    pos = bisect.bisect_left(ends, num)
    if pos > 0:
        key = ends[pos-1]
        counts[key] -= 1
        if counts[key] == 0:
            del counts[key]
            del ends[pos-1]
    if num in counts:
        counts[num] += 1
    else:
        counts[num] = 1
        ins_pos = bisect.bisect_left(ends, num)
        ends.insert(ins_pos, num)

print(sum(counts.values()))

