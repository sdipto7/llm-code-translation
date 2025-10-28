
import sys

n = int(sys.stdin.readline())
arr = [int(sys.stdin.readline()) for _ in range(n)]
cnt = 0
flag = True

while True:
    for i in range(n):
        if arr[i] % 2 != 0:
            flag = False
            break
        arr[i] = arr[i] // 2
    if flag:
        cnt += 1
    else:
        break

print(cnt)

