
import sys

BIG_NUM = 2000000000
MOD = 1000000007

while True:
    inputed = sys.stdin.readline().strip()
    if inputed == "0":
        break
    ans = 0
    for i in range(len(inputed)):
        ans += int(inputed[i])
    print(ans)

