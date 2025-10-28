
import sys

nums = input().split()
N = int(nums[0])
M = int(nums[1])
room = [['' for _ in range(M)] for _ in range(N)]
D = int(nums[2])
num = 0

def input_room():
    for i in range(N):
        str_room = input()
        room[i] = list(str_room)

def set_WE():
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

def set_NS():
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

input_room()
if M >= D:
    set_WE()
if N >= D:
    set_NS()
print(num)

