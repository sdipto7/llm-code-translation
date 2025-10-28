
import sys

class Main:
    def main(self):
        n = int(sys.stdin.readline().strip())
        array = []
        cnt = 0
        cnt2 = 0

        for _ in range(n):
            array.append(sys.stdin.readline().strip())

        array.sort()

        a = array[0]
        cnt = 1
        for i in range(n):
            if a != array[i]:
                cnt += 1
            a = array[i]

        print(cnt)

if __name__ == "__main__":
    Main().main()

