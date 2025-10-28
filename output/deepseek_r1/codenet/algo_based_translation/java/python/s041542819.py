
import sys

def lower_bound(a, t, min_val=0):
    max_val = len(a)
    while min_val < max_val:
        mid = (min_val + max_val) // 2
        if t <= a[mid]:
            max_val = mid
        else:
            min_val = mid + 1
    return min_val

def main():
    input = sys.stdin.read().split()
    ptr = 0
    a = int(input[ptr])
    ptr += 1
    b = int(input[ptr])
    ptr += 1
    q = int(input[ptr])
    ptr += 1

    shrines = []
    for _ in range(a):
        shrines.append(int(input[ptr]))
        ptr += 1
    s = [-10**10] + shrines + [2 * 10**10]

    temples = []
    for _ in range(b):
        temples.append(int(input[ptr]))
        ptr += 1
    t = [-10**10] + temples + [2 * 10**10]

    for _ in range(q):
        x = int(input[ptr])
        ptr += 1

        idx_s = lower_bound(s, x + 1)
        left_s = max(0, idx_s - 1)
        sl = x - s[left_s]
        sr = s[idx_s] - x

        idx_t = lower_bound(t, x + 1)
        left_t = max(0, idx_t - 1)
        tl = x - t[left_t]
        tr = t[idx_t] - x

        candidates = [
            max(sl, tl),
            max(sr, tr),
            2 * sl + tr,
            2 * tl + sr,
            sl + 2 * tr,
            tl + 2 * sr
        ]
        print(min(candidates))

if __name__ == '__main__':
    main()

