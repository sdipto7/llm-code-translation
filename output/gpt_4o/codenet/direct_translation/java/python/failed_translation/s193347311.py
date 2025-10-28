
intLoop = int(input())
intTaro = 0
intHana = 0

for _ in range(intLoop):
    strTaro = input()
    strHana = input()
    if strTaro < strHana:
        intHana += 3
    elif strTaro == strHana:
        intTaro += 1
        intHana += 1
    else:
        intTaro += 3

print(intTaro, intHana)

