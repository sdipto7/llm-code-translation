
import sys

def main():
    a, ta = map(int, sys.stdin.readline().split())
    b, tb = map(int, sys.stdin.readline().split())
    timing = sys.stdin.readline().strip()
    hr, min = int(timing[:2]), int(timing[3:])
    sim_depart = hr * 60 + min
    sim_arrive = sim_depart + ta
    counter = 0
    for i in range(300, 1440, b):
        bus_depart = i
        bus_arrive = i + tb
        if bus_depart >= sim_arrive or sim_depart >= bus_arrive:
            continue
        counter += 1
    print(counter)

if __name__ == "__main__":
    main()

