
n = int(input())
array = [input().strip() for _ in range(n)]
array.sort()
cnt = 1
a = array[0]
for s in array:
    if s != a:
        cnt += 1
        a = s
print(cnt)

