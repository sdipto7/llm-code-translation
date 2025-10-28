
def revpos(p, q):
    vector = [p[0] - q[0], p[1] - q[1]]
    vector = [vector[1], -vector[0]]
    return [q[0] + vector[0], q[1] + vector[1]]

input = list(map(int, input().split()))
a, b, c, d = input
positions = [[a, b], [c, d], None, None]
positions[2] = revpos(positions[0], positions[1])
positions[3] = revpos(positions[1], positions[2])

if positions[0] == revpos(positions[3], positions[2]):
    print("OK")

output = [positions[2][0], positions[2][1], positions[3][0], positions[3][1]]
for num in output:
    print(num)

