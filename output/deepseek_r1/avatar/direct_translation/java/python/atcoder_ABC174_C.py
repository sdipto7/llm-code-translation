
K = int(input())
if K % 2 == 0 or K % 5 == 0:
    print(-1)
else:
    if K % 7 == 0:
        K = K // 7
    K *= 9
    remainder = 10 % K
    ans = 1
    while remainder != 1:
        ans += 1
        remainder = (remainder * 10) % K
    print(ans)

