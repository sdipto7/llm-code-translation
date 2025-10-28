
import sys

def main():
    data = sys.stdin.read().splitlines()
    line1 = data[0].split()
    a = int(line1[0])
    tA = int(line1[1])
    line2 = data[1].split()
    b = int(line2[0])
    tB = int(line2[1])
    timing = data[2]
    hrs = int(timing[0:2])
    mins = int(timing[3:])
    simDeparture = hrs * 60 + mins
    simArrival = simDeparture + tA
    counter = 0
    i = 300
    while i < 1440:
        busDeparture = i
        busArrival = i + tB
        if not (busDeparture >= simArrival or simDeparture >= busArrival):
            counter += 1
        i += b
    print(counter)

if __name__ == "__main__":
    main()

