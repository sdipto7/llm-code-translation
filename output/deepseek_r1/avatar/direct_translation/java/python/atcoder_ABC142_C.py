n = int(input())
a = list(map(int, input().split()))
d = {num: i+1 for i, num in enumerate(a)}
print(' '.join(str(d[i]) for i in range(1, n+1)))
