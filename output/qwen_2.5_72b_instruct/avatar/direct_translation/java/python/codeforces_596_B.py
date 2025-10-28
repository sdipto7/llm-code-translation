
n = int(input())
arr = [int(input()) for _ in range(n)]
answer = abs(arr[0])
for i in range(1, n):
    answer += abs(arr[i] - arr[i - 1])
print(answer)

