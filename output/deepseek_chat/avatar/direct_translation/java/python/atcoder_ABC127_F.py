
import sys
import heapq

def main():
    input = sys.stdin.read
    data = input().split()
    idx = 0
    t = int(data[idx])
    idx += 1
    pqmax = []
    pqmin = []
    sumMin = 0
    sumMax = 0
    sumb = 0
    min_val = 0
    while t > 0:
        op = data[idx]
        idx += 1
        if op == '2':
            ans = min_val * len(pqmin) - sumMin
            ans1 = sumMax - min_val * len(pqmax)
            print(min_val, ans + ans1 + sumb)
        else:
            in_val = int(data[idx])
            idx += 1
            b = int(data[idx])
            idx += 1
            sumb += b
            if in_val > min_val:
                heapq.heappush(pqmax, in_val)
                sumMax += in_val
            else:
                heapq.heappush(pqmin, -in_val)
                sumMin += in_val
            if len(pqmin) > len(pqmax):
                val = -heapq.heappop(pqmin)
                sumMax += val
                sumMin -= val
                heapq.heappush(pqmax, val)
            if len(pqmin) < len(pqmax):
                val = heapq.heappop(pqmax)
                sumMax -= val
                sumMin += val
                heapq.heappush(pqmin, -val)
            min_val = -pqmin[0] if pqmin else 0
        t -= 1

if __name__ == "__main__":
    main()

