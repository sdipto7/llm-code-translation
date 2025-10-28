
import sys

sc = sys.stdin
nums = sc.readline().split()

N = int(nums[0])
M = int(nums[1])
room = [[' ' for _ in range(M)] for _ in range(N)]
D = int(nums[2])
num = 0

def inputRoom():
    for i in range(N):
        str_room = sc.readline().strip()
        room[i] = list(str_room)

def setWE():
    canPut = True

    for i in range(N):
        for j in range(M - D + 1):
            canPut = True

            for k in range(D):
                if room[i][j + k] == '#':
                    canPut = False
                    break

            if canPut:
                num += 1

def setNS():
    canPut = True

    for i in range(M):
        for j in range(N - D + 1):
            canPut = True

            for k in range(D):
                if room[j + k][i] == '#':
                    canPut = False
                    break

            if canPut:
                num += 1

inputRoom()

if M >= D:
    setWE()

if N >= D:
    setNS()

print(num)

