
import sys

def main():
    data = sys.stdin.read().split()
    n = int(data[0])
    list_vals = list(map(int, data[1:1+n]))
    odd = []
    total_sum = 0
    for num in list_vals:
        if num % 2 == 0:
            total_sum += num
        else:
            odd.append(num)
    odd.sort()
    for num in odd:
        total_sum += num
    if len(odd) % 2 != 0:
        total_sum -= odd[0]
    print(total_sum)

if __name__ == "__main__":
    main()

