
n = int(input())
a = list(map(int, input().split()))
count = 0
i = 0
while i < n:
    if i == n - 1:
        count += 1
        i += 1
    else:
        if a[i] == a[i+1]:
            i += 1
        elif a[i] < a[i+1]:
            while i < n - 1 and a[i] <= a[i+1]:
                i += 1
            count += 1
            i += 1
        else:
            while i < n - 1 and a[i] >= a[i+1]:
                i += 1
            count += 1
            i += 1
print(count)

