
import sys

def get_ints():
    for line in sys.stdin:
        for num in line.split():
            yield int(num)

gen = get_ints()
numlist = [next(gen) for _ in range(5)]
k = next(gen)

if numlist[4] - numlist[0] > k:
    print(":(")
else:
    print("Yay!")

