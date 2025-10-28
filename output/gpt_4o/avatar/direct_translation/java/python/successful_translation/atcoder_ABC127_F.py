
import sys
import heapq

input = sys.stdin.read
data = input().split()

t = int(data[0])
index = 1

pqmax = []
pqmin = []
sumMin = 0
sumMax = 0
sumb = 0
min_val = 0

for _ in range(t):
    s = data[index]
    index += 1
    if s[0] == '2':
        ans = min_val * len(pqmin) - sumMin
        ans1 = sumMax - min_val * len(pqmax)
        print(min_val, ans + ans1 + sumb)
    else:
        in_val = int(data[index])
        index += 1
        sumb += int(data[index])
        index += 1
        if in_val > min_val:
            heapq.heappush(pqmax, in_val)
            sumMax += in_val
        else:
            heapq.heappush(pqmin, -in_val)
            sumMin += in_val
        if len(pqmin) > len(pqmax):
            move_val = -heapq.heappop(pqmin)
            sumMax += move_val
            sumMin -= move_val
            heapq.heappush(pqmax, move_val)
        if len(pqmin) < len(pqmax):
            move_val = heapq.heappop(pqmax)
            sumMax -= move_val
            sumMin += move_val
            heapq.heappush(pqmin, -move_val)
        min_val = -pqmin[0]

