
import sys

def main():
    line1 = sys.stdin.readline().split()
    a, tA = map(int, line1)
    line2 = sys.stdin.readline().split()
    b, tB = map(int, line2)
    timing = sys.stdin.readline().strip()
    hrs = int(timing[:2])
    mins = int(timing[3:])
    sim_departure = hrs * 60 + mins
    sim_arrival = sim_departure + tA
    counter = 0
    i = 300
    while i < 1440:
        bus_arrival = i + tB
        if not (i >= sim_arrival or sim_departure >= bus_arrival):
            counter += 1
        i += b
    print(counter)

if __name__ == "__main__":
    main()

