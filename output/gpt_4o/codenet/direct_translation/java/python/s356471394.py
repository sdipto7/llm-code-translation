
def input_room():
    room = []
    for _ in range(N):
        str_room = input().strip()
        room.append(list(str_room))
    return room

def set_we():
    global num
    for i in range(N):
        for j in range(M - D + 1):
            can_put = True
            for k in range(D):
                if room[i][j + k] == '#':
                    can_put = False
                    break
            if can_put:
                num += 1

def set_ns():
    global num
    for i in range(M):
        for j in range(N - D + 1):
            can_put = True
            for k in range(D):
                if room[j + k][i] == '#':
                    can_put = False
                    break
            if can_put:
                num += 1

nums = input().strip().split()
N = int(nums[0])
M = int(nums[1])
D = int(nums[2])
room = input_room()
num = 0

if M >= D:
    set_we()

if N >= D:
    set_ns()

print(num)

