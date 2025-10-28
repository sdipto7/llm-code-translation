
def count_ones(brr):
    return sum(brr)

def main():
    try:
        n = int(input())
        arr = list(map(int, input().split()))
        max_count = float('-inf')
        for i in range(n):
            for j in range(i, n):
                brr = arr[:]
                for k in range(i, j+1):
                    brr[k] = 1 - brr[k]
                count = count_ones(brr)
                max_count = max(max_count, count)
        if n == 1:
            if arr[0] == 1:
                print(0)
            else:
                print(1)
        else:
            print(max_count)
    except Exception:
        pass

if __name__ == "__main__":
    main()

