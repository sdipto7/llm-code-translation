
N = int(input())
count = 0
next = 10
i = 1
while i <= N:
    count += 1
    if i == next - 1:
        i = next * 10 - 1
        next *= 100
    i += 1
print(count)

