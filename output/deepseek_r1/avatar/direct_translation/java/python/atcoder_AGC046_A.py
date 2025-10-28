
x = int(input())
current = 0
count = 0
while current != 360:
    current += x
    if current > 360:
        current -= 360
    count += 1
print(count)

