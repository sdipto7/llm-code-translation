
info = [[[0 for _ in range(10)] for _ in range(3)] for _ in range(4)]

n = int(input())
for _ in range(n):
    built = int(input())
    floor = int(input())
    room = int(input())
    num = int(input())
    info[built - 1][floor - 1][room - 1] += num

for i in range(4):
    for j in range(3):
        for k in range(10):
            print(f" {info[i][j][k]}", end="")
        print()
    if i != 4 - 1:
        print("####################")

