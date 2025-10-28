
s = input()
count = {}
for char in s:
    if char in count:
        count[char] += 1
    else:
        count[char] = 1
if all(value == 2 for value in count.values()) and len(count) == 2:
    print("Yes")
else:
    print("No")

