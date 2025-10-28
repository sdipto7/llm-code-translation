
import sys

input = sys.stdin.read().split()
a = int(input[0])
tA = int(input[1])
b = int(input[2])
tB = int(input[3])
timing = input[4]
hrs = int(timing[:2])
mins = int(timing[3:])
simDeparture = hrs * 60 + mins
simArrival = simDeparture + tA
counter = 0
for i in range(300, 1440, b):
    busDeparture = i
    busArrival = i + tB
    if busDeparture >= simArrival or simDeparture >= busArrival:
        continue
    counter += 1
print(counter)

