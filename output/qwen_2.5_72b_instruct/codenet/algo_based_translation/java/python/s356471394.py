
import sys

class Main:
    @staticmethod
    def main():
        import sys
        import sys
        sc = sys.stdin
        nums = sc.readline().split()
        N = int(nums[0])
        M = int(nums[1])
        room = [['' for _ in range(M)] for _ in range(N)]
        D = int(nums[2])
        num = 0

        Main.inputRoom(room, N, M, sc)

        if M >= D:
            num += Main.setWE(room, N, M, D)

        if N >= D:
            num += Main.setNS(room, N, M, D)

        print(num)

    @staticmethod
    def setWE(room, N, M, D):
        num = 0
        for i in range(N):
            for j in range(M - D + 1):
                canPut = True
                for k in range(D):
                    if room[i][j + k] == '#':
                        canPut = False
                        break
                if canPut:
                    num += 1
        return num

    @staticmethod
    def setNS(room, N, M, D):
        num = 0
        for i in range(M):
            for j in range(N - D + 1):
                canPut = True
                for k in range(D):
                    if room[j + k][i] == '#':
                        canPut = False
                        break
                if canPut:
                    num += 1
        return num

    @staticmethod
    def inputRoom(room, N, M, sc):
        for i in range(N):
            str_room = sc.readline().strip()
            room[i] = list(str_room)

if __name__ == "__main__":
    Main.main()

