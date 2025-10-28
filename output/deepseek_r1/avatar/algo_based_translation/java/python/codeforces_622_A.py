
def get_value_at_index(index):
    return 1 + ((index - 1) * index) // 2

def solve():
    position = int(input())
    nrst = 1
    while get_value_at_index(nrst * 2) < position:
        nrst *= 2
    while get_value_at_index(nrst + 1) <= position:
        nrst += 1
    start_index = get_value_at_index(nrst)
    print((position - start_index) + 1)

if __name__ == "__main__":
    solve()

