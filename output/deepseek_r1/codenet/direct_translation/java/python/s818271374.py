
n = int(input())
count1 = 0
count2 = 0
for _ in range(n):
    a = int(input())
    if a % 4 == 0:
        count1 += 1
    elif a % 2 == 0 and (a // 2) % 2 == 1:
        count2 += 1
if count1 >= n // 2:
    print("Yes")
else:
    required = (n // 2 - count1) * 2 + (n % 2)
    print("Yes" if required == count2 else "No")

