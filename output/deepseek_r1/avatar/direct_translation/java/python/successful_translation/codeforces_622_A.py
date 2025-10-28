import sys

def get_value_at_index(index):
    return 1 + (index - 1) * index // 2

def solve():
    position = int(sys.stdin.readline())
    nrst = 1
    while get_value_at_index(nrst * 2) < position:
        nrst *= 2
    while get_value_at_index(nrst + 1) <= position:
        nrst += 1
    start = get_value_at_index(nrst)
    print(position - start + 1)

solve()
