n = int(input())
ara = list(map(int, input().split()))
freq = {}
for num in ara:
    freq[num] = freq.get(num, 0) + 1
max_freq = max(freq.values())

current = {}
for num in ara:
    current[num] = current.get(num, 0) + 1
    if current[num] == max_freq:
        print(num)
        break
