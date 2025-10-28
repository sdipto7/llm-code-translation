import sys
input = sys.stdin.read
data = input().split()
n = int(data[0])
k = int(data[1])
arr = list(map(int, data[2:2+n]))
res = []
o = 0
e = 0
for i in range(n):
    if arr[i] == 1:
        o += 1
    else:
        e += 1
index = 2 + n
for i in range(k):
    l = int(data[index]) - 1
    r = int(data[index + 1]) - 1
    index += 2
    if (r - l + 1) % 2 == 1:
        res.append("0\n")
    else:
        if (r - l + 1) // 2 <= o and (r - l + 1) // 2 <= e:
            res.append("1\n")
        else:
            res.append("0\n")
print("".join(res))
