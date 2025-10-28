
import sys

def main():
    data = sys.stdin.read().splitlines()
    nums = data[0].split()
    N = int(nums[0])
    M = int(nums[1])
    D = int(nums[2])
    room = []
    num = 0
    
    for i in range(1, N + 1):
        room.append(list(data[i].strip()))
    
    if M >= D:
        setWE(room, N, M, D)
    
    if N >= D:
        setNS(room, N, M, D)
    
    print(num)

def setWE(room, N, M, D):
    global num
    for i in range(N):
        for j in range(M - D + 1):
            canPut = True
            for k in range(D):
                if room[i][j + k] == '#':
                    canPut = False
                    break
            if canPut:
                num += 1

def setNS(room, N, M, D):
    global num
    for i in range(M):
        for j in range(N - D + 1):
            canPut = True
            for k in range(D):
                if room[j + k][i] == '#':
                    canPut = False
                    break
            if canPut:
                num += 1

if __name__ == "__main__":
    main()

