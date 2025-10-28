
def checKNo(brr):
    val = 0
    for i in brr:
        if i == 1:
            val += 1
    return val

def main():
    import sys
    input = sys.stdin.read
    data = input().strip().split()

    if data:
        n = int(data[0])
        arr = list(map(int, data[1:n+1]))

        if n == 1:
            if arr[0] == 1:
                print(0)
            else:
                print(1)
            return

        max_val = float('-inf')

        for i in range(n):
            for j in range(i, n):
                brr = arr[:]
                for k in range(i, j + 1):
                    brr[k] = 1 if brr[k] == 0 else 0
                count = checKNo(brr)
                if count > max_val:
                    max_val = count

        print(max_val)

if __name__ == "__main__":
    main()

