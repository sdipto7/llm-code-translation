
sc_list = []
try:
    while True:
        sc_list.append(input())
except EOFError:
    pass

numlist = sc_list[0].split(" ")
sheep = int(numlist[0])
wolves = int(numlist[1])

if wolves >= sheep:
    print("unsafe")
else:
    print("safe")

