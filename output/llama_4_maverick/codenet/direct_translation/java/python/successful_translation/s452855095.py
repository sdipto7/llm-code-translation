
import sys

def main():
    sc = sys.stdin.readline
    out = sys.stdout.write
    n = int(sc())
    arr = list(map(int, sc().split()))
    cnt = 0
    flag = True
    while True:
        for i in range(n):
            if arr[i] % 2 != 0:
                flag = False
                break
            else:
                arr[i] = arr[i] // 2
        if flag == True:
            cnt += 1
        else:
            break
    out(str(cnt) + '\n')

if __name__ == "__main__":
    main()

