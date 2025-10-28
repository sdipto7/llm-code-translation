
Num = [0] * 11
for i = 0
while i < 10:
    Num[i] = int(input())
    i += 1

for a in range(9, -1, -1):
    for b in range(a):
        if Num[b] < Num[b+1]:
            Num[10] = Num[b]
            Num[b] = Num[b+1]
            Num[b+1] = Num[10]

print(Num[0])
print(Num[1])
print(Num[2])

