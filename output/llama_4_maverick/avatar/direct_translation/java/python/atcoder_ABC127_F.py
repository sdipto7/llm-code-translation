
import heapq
import sys

def main():
    input = sys.stdin.readline
    t = int(input())
    pqmax = []
    pqmin = []
    sumMin, sumMax, sumb = 0, 0, 0
    min_val = 0
    for _ in range(t):
        s = input().split()
        if s[0][0] == '2':
            ans = min_val * len(pqmin) - sumMin
            ans1 = sumMax - min_val * len(pqmax)
            print(min_val, ans + ans1 + sumb)
        else:
            in_val = int(s[1])
            sumb += int(s[2])
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
            min_val = -pqmin[0]

if __name__ == "__main__":
    main()

