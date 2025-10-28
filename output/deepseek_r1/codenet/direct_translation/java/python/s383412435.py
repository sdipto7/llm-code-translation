
n = int(input())
if n == 0:
    print(0)
else:
    a = list(map(int, input().split()))
    a.sort()
    if n == 1 and a[0] > 1:
        print(1)
    else:
        ans = 0
        prev = a[0]
        count = 1
        for i in range(1, n):
            if a[i] == prev:
                count += 1
            else:
                if count < prev:
                    ans += count
                elif count > prev:
                    ans += count - prev
                prev = a[i]
                count = 1
        if count < prev:
            ans += count
        elif count > prev:
            ans += count - prev
        print(ans)

