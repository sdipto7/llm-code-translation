
import sys

def checKNo(brr):
    val = 0
    for i in brr:
        if i == 1:
            val += 1
    return val

def main():
    data = sys.stdin.read().split()
    if data:
        n = int(data[0])
        arr = list(map(int, data[1:1+n]))
        max_val = -10**9
        
        for i in range(n):
            for j in range(i, n):
                brr = arr.copy()
                for k in range(i, j+1):
                    if brr[k] == 0:
                        brr[k] = 1
                    else:
                        brr[k] = 0
                count = checKNo(brr)
                if count > max_val:
                    max_val = count
        
        if n == 1:
            if arr[0] == 1:
                print(0)
            else:
                print(1)
        else:
            print(max_val)

if __name__ == "__main__":
    main()

