n, k = map(int, input().split())
s = input().strip()

if k > n // 2:
    while k < n:
        print("RIGHT")
        k += 1
else:
    while k > 1:
        print("LEFT")
        k -= 1

if k == 1:
    for i in range(len(s)):
        print(f"PRINT {s[i]}")
        if i < len(s) - 1:
            print("RIGHT")
else:
    for i in reversed(range(len(s))):
        print(f"PRINT {s[i]}")
        if i > 0:
            print("LEFT")
