
import sys
import heapq

def main():
    output_stream = sys.stdout
    import sys
    import heapq

    t = int(input().strip())
    pqmax = []
    pqmin = []
    sumMin = 0
    sumMax = 0
    sumb = 0
    min_val = float('inf')

    for _ in range(t):
        s = input().strip().split()
        if s[0] == '2':
            ans = min_val * len(pqmin) - sumMin
            ans1 = sumMax - min_val * len(pqmax)
            output_stream.write(f"{min_val} {ans + ans1 + sumb}\n")
        else:
            in_val = int(s[1])
            sumb += int(s[2])
            if in_val > min_val:
                heapq.heappush(pqmax, -in_val)
                sumMax += in_val
            else:
                heapq.heappush(pqmin, in_val)
                sumMin += in_val
            if len(pqmin) > len(pqmax):
                val = heapq.heappop(pqmin)
                sumMin -= val
                sumMax += val
                heapq.heappush(pqmax, -val)
            if len(pqmin) < len(pqmax):
                val = -heapq.heappop(pqmax)
                sumMax -= val
                sumMin += val
                heapq.heappush(pqmin, val)
            if pqmin:
                min_val = pqmin[0]

if __name__ == "__main__":
    main()

