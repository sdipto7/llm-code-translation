n = int(input())
words = [input().strip() for _ in range(n)]
seen = set()
prev_last = ''

for word in words:
    if word in seen:
        print("No")
        exit()
    seen.add(word)
    if prev_last:
        if word[0] != prev_last:
            print("No")
            exit()
    prev_last = word[-1]

print("Yes")
