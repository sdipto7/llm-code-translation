
import sys

class Main:
    def main(self):
        N = int(sys.stdin.readline().strip())
        A = list(map(int, sys.stdin.readline().split()))
        if len(A) != N:
            A = list(map(int, sys.stdin.read().split()))
        min_val = float('inf')
        count = 0
        total_sum = 0
        for num in A:
            if num < 0:
                count += 1
            min_val = min(min_val, abs(num))
            total_sum += abs(num)
        if count % 2 == 0:
            print(total_sum)
        else:
            print(total_sum - min_val * 2)

if __name__ == "__main__":
    Main().main()

