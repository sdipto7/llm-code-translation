
import sys
lines = sys.stdin.readlines()
numlist = lines[0].strip().split()
Sheep = int(numlist[0])
Wolve = int(numlist[1])
if Wolve >= Sheep:
    print("unsafe")
else:
    print("safe")

