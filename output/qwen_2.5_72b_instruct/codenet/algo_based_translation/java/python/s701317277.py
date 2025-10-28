
def main():
    import sys

    input = sys.stdin.read
    data = input().split()

    N = int(data[0])
    A = list(map(int, data[1:]))

    min_val = float('inf')
    count = 0
    total_sum = 0

    for i in range(N):
        if A[i] < 0:
            count += 1
        min_val = min(min_val, abs(A[i]))
        total_sum += abs(A[i])

    if count % 2 == 0:
        print(total_sum)
    else:
        print(total_sum - min_val * 2)

if __name__ == "__main__":
    main()

