
import sys

def main():
    n = int(sys.stdin.readline())
    arr = list(map(int, sys.stdin.readline().split()))
    max_val = -float('inf')
    for i in range(n):
        for j in range(i, n):
            brr = arr.copy()
            for k in range(i, j+1):
                if brr[k] == 0:
                    brr[k] = 1
                else:
                    brr[k] = 0
            count = check_no(brr)
            if count > max_val:
                max_val = count
    if n == 1:
        if arr[0] == 1:
            print(0)
        else:
            print(1)
    else:
        print(max_val)

def check_no(brr):
    val = 0
    for i in brr:
        if i == 1:
            val += 1
    return val

if __name__ == "__main__":
    main()

