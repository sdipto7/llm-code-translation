
import sys

def input_room(N, room):
    for i in range(N):
        str_room = input().strip()
        room.append(list(str_room))

def set_we(N, M, D, room):
    num = 0
    for i in range(N):
        for j in range(M - D + 1):
            can_put = True
            for k in range(D):
                if room[i][j + k] == '#':
                    can_put = False
                    break
            if can_put:
                num += 1
    return num

def set_ns(N, M, D, room):
    num = 0
    for i in range(M):
        for j in range(N - D + 1):
            can_put = True
            for k in range(D):
                if room[j + k][i] == '#':
                    can_put = False
                    break
            if can_put:
                num += 1
    return num

def main():
    nums = input().strip().split()
    N = int(nums[0])
    M = int(nums[1])
    D = int(nums[2])
    room = []

    input_room(N, room)

    num = 0
    if M >= D:
        num += set_we(N, M, D, room)

    if N >= D:
        num += set_ns(N, M, D, room)

    print(num)

if __name__ == "__main__":
    main()

