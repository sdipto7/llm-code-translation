a, tA = map(int, input().split())
b, tB = map(int, input().split())
timing = input().strip()
hrs = int(timing[:2])
mins = int(timing[3:5])
sim_departure = hrs * 60 + mins
sim_arrival = sim_departure + tA
count = 0
for bus_departure in range(300, 1440, b):
    bus_arrival = bus_departure + tB
    if bus_departure >= sim_arrival or sim_departure >= bus_arrival:
        continue
    count += 1
print(count)
