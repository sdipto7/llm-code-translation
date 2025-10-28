
n = int(input())
a = list(map(int, input().split()))
r = 0
for num in a:
    r ^= num
print(' '.join(str(r ^ x) for x in a))

