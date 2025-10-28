
def is_valid(s1, s2):
    return all(c in s1 for c in s2)

def main():
    s1 = input()
    s2 = input()
    if not is_valid(s1, s2):
        print(-1)
        return
    from collections import defaultdict
    m1 = defaultdict(int)
    m2 = defaultdict(int)
    for c in s1:
        m1[c] += 1
    for c in s2:
        m2[c] += 1
    ans = 0
    seen = set()
    for c in s2:
        if c not in seen:
            seen.add(c)
            cnt1 = m1.get(c, 0)
            cnt2 = m2.get(c, 0)
            ans += min(cnt1, cnt2)
    print(ans)

if __name__ == "__main__":
    main()

