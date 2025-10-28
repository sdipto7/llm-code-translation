
import sys

def main():
    input = sys.stdin.read
    data = input().split()
    n = int(data[0])
    arr = list(map(int, data[1:n+1]))
    cnt = 0
    flag = True
    while True:
        for i in range(n):
            if arr[i] % 2 != 0:
                flag = False
                break
            else:
                arr[i] = arr[i] // 2
        if flag:
            cnt += 1
        else:
            break
    print(cnt)

if __name__ == "__main__":
    main()

