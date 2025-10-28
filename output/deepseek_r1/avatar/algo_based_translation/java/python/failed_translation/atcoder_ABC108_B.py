
import sys

def revpos(p, q):
    vec = [p[0] - q[0], p[1] - q[1]]
    tmp = vec[0]
    vec[0] = vec[1]
    vec[1] = -tmp
    newpos = [q[0] + vec[0], q[1] + vec[1]]
    return newpos

if __name__ == '__main__':
    input_list = list(map(int, sys.stdin.readline().split()))
    position = [[0, 0] for _ in range(4)]
    position[0][0], position[0][1] = input_list[0], input_list[1]
    position[1][0], position[1][1] = input_list[2], input_list[3]
    position[2] = revpos(position[0], position[1])
    position[3] = revpos(position[1], position[2])
    if position[0] is revpos(position[2], position[3]):
        print("OK")
    output = position[2] + position[3]
    for num in output:
        print(num)

