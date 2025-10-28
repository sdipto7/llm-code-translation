
import sys

def count_set_bits(n):
    count = 0
    while n:
        count += n & 1
        n >>= 1
    return count

def main():
    input = sys.stdin.readline
    n = int(input())
    a = [0] * 33
    for _ in range(n):
        x = int(input())
        a[count_set_bits(x)] += 1
    answer = 0
    for i in range(33):
        summ = (a[i] - 1) * a[i] / 2
        answer += summ
    sys.stdout.write(str(int(answer)) + '\n')

if __name__ == "__main__":
    main()

