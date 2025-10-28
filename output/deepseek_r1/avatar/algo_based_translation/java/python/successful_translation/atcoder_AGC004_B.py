
import sys

def main():
    N, x = map(int, sys.stdin.readline().split())
    srime_list = list(map(int, sys.stdin.readline().split()))
    cost_list = []
    for i in range(N):
        row = [0] * N
        row[0] = srime_list[i]
        for cast_num in range(1, N):
            index = (i - cast_num + N) % N
            row[cast_num] = min(row[cast_num - 1], srime_list[index])
        cost_list.append(row)
    result = []
    for i in range(N):
        total = sum(cost_row[i] for cost_row in cost_list)
        result.append(i * x + total)
    print(min(result))

if __name__ == "__main__":
    main()

