
import sys
from collections import OrderedDict

def main():
    a = [int(sys.stdin.readline()) for _ in range(5)]
    r = [x % 10 for x in a]
    wait_map = {}
    for i in range(5):
        remainder = r[i]
        if remainder != 0:
            b = 10 - remainder
            wait_map[b] = a[i]
    if not wait_map:
        print(sum(a))
        return
    max_b = max(wait_map.keys())
    last_val = wait_map[max_b]
    idx = -1
    for i in range(4, -1, -1):
        if a[i] == last_val:
            idx = i
            break
    ans = 0
    for i in range(5):
        if i != idx:
            rem = a[i] % 10
            if rem == 0:
                ans += a[i]
            else:
                ans += a[i] + (10 - rem)
    ans += last_val
    print(ans)

if __name__ == "__main__":
    main()

