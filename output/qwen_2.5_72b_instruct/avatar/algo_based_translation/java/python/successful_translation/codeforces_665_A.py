
import sys

def main():
    import sys
    from io import StringIO
    import re

    input = sys.stdin.read().splitlines()
    st = re.split(r'\s+', input[0])
    a = int(st[0])
    tA = int(st[1])
    st = re.split(r'\s+', input[1])
    b = int(st[0])
    tB = int(st[1])
    timing = input[2]
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

if __name__ == "__main__":
    main()

