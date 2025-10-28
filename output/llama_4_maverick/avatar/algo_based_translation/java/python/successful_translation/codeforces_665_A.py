
import sys

def main():
    a, tA = map(int, sys.stdin.readline().split())
    b, tB = map(int, sys.stdin.readline().split())
    timing = sys.stdin.readline().strip()
    hrs, mins = map(int, timing.split(':'))
    simDeparture = hrs * 60 + mins
    simArrival = simDeparture + tA
    counter = 0
    for i in range(300, 1440, b):
        busDeparture = i
        busArrival = i + tB
        if busDeparture >= simArrival or simDeparture >= busArrival:
            continue
        counter += 1
    sys.stdout.write(str(counter) + '\n')
    sys.stdout.flush()

if __name__ == "__main__":
    main()

