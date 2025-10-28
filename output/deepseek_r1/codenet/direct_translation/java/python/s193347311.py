
n = int(input())
tokens = input().split()
taro = hana = 0
for i in range(n):
    a, b = tokens[2*i], tokens[2*i+1]
    if a < b:
        hana += 3
    elif a == b:
        taro += 1
        hana += 1
    else:
        taro += 3
print(taro, hana)

