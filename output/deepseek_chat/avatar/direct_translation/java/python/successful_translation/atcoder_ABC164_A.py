
import sys

sc_list = []
for i in range(sys.maxsize):
    try:
        sc_list.append(input())
    except:
        break

num_list = sc_list[0].split()
sheep = int(num_list[0])
wolve = int(num_list[1])

if wolve >= sheep:
    print("unsafe")
else:
    print("safe")

