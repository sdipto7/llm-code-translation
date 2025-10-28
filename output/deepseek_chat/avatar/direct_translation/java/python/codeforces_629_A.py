
import sys

def main():
    sc = sys.stdin
    num = int(sc.readline())
    counter = 0
    fine = 0
    arr = []
    for _ in range(num):
        s = sc.readline().strip()
        arr.append(s)
    for i in range(num):
        for k in range(num):
            if arr[k][i] == 'C':
                counter += 1
        fine += (counter * (counter - 1)) // 2
        counter = 0
    for i in range(num):
        for k in range(num):
            if arr[i][k] == 'C':
                counter += 1
        fine += (counter * (counter - 1)) // 2
        counter = 0
    print(fine)

if __name__ == "__main__":
    main()

