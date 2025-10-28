
import sys

def main():
    input = sys.stdin.read
    data = input().splitlines()
    
    # Read first line of input
    a, tA = map(int, data[0].split())
    
    # Read second line of input
    b, tB = map(int, data[1].split())
    
    # Read timing input
    timing = data[2]
    hrs = int(timing[0:2])
    mins = int(timing[3:])
    
    # Calculate simulated departure and arrival times
    simDeparture = hrs * 60 + mins
    simArrival = simDeparture + tA
    
    # Initialize counter
    counter = 0
    
    # Loop through each minute from 300 to 1439
    for i in range(300, 1440, b):
        busDeparture = i
        busArrival = i + tB
        if busDeparture >= simArrival or simDeparture >= busArrival:
            continue
        counter += 1
    
    # Output result
    sys.stdout.write(str(counter) + '\n')

if __name__ == "__main__":
    main()

