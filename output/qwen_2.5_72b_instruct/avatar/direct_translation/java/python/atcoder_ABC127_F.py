
import sys
import heapq

output_stream = sys.stdout
out = sys.stdout

def main():
    import sys
    import heapq
    import sys
    import heapq

    input = sys.stdin.read().splitlines()
    t = int(input[0])
    s = []
    pqmax = []
    pqmin = []
    sumMin = 0
    sumMax = 0
    sumb = 0
    min_val = 0
    idx = 1
    while t > 0:
        s = input[idx].split()
        if s[0][0] == '2':
            ans = min_val
            ans *= len(pqmin)
            ans -= sumMin
            ans1 = min_val
            ans1 *= len(pqmax)
            ans1 = sumMax - ans1
            out.write(f"{min_val} {ans + ans1 + sumb}\n")
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
                sumMax += pqmin[0]
                sumMin -= pqmin[0]
                heapq.heappush(pqmax, -heapq.heappop(pqmin))
            if len(pqmin) < len(pqmax):
                sumMax += -pqmax[0]
                sumMin -= -pqmax[0]
                heapq.heappush(pqmin, -heapq.heappop(pqmax))
            min_val = pqmin[0]
        idx += 1
        t -= 1

if __name__ == "__main__":
    main()

