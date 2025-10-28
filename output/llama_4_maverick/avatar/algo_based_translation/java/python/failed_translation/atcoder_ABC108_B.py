
def revpos(p, q):
    vec = [p[0] - q[0], p[1] - q[1]]
    vec = [vec[1], -vec[0]]
    newpos = [q[0] + vec[0], q[1] + vec[1]]
    return newpos

def main():
    input_values = list(map(int, input().split()))
    positions = [[0, 0] for _ in range(4)]
    positions[0] = input_values[:2]
    positions[1] = input_values[2:]
    positions[2] = revpos(positions[0], positions[1])
    positions[3] = revpos(positions[1], positions[2])
    if positions[0] == revpos(positions[2], positions[3]):
        print("OK")
    print(positions[2][0])
    print(positions[2][1])
    print(positions[3][0])
    print(positions[3][1])

if __name__ == "__main__":
    main()

