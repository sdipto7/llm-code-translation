
import sys
input = sys.stdin.readline
a, tA = map(int, input().split())
b, tB = map(int, input().split())
hrs, mins = map(int, input().split(':'))
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

