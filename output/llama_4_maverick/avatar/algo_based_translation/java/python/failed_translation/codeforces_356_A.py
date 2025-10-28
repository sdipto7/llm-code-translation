
from sortedcontainers import SortedSet

def main():
    n = int(input())
    s = SortedSet(range(n))
    answer = [0] * n
    q = int(input())
    for _ in range(q):
        l, r, win = map(int, input().split())
        l -= 1
        r -= 1
        win -= 1
        idx = s.bisect_left(l)
        while idx < len(s) and s[idx] <= r:
            curr = s[idx]
            answer[curr] = win + 1
            s.remove(curr)
            idx = s.bisect_left(l)
        answer[win] = 0
        s.add(win)
    print(' '.join(map(str, answer)))

if __name__ == "__main__":
    main()

