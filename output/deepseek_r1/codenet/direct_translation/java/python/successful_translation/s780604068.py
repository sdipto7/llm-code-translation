N = int(input())
rest = list(map(int, input().split()))
rest.sort()
sum_ = 0
for i in range(0, 2*N, 2):
    sum_ += rest[i]
print(sum_)
