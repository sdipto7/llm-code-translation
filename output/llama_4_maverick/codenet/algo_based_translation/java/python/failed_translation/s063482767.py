
import heapq
import sys

class Main:
    def __init__(self):
        pass

    def main(self):
        n = int(sys.stdin.readline().strip())
        queue = []
        for _ in range(n):
            heapq.heappush(queue, int(sys.stdin.readline().strip()))
        sum_val = 0
        for _ in range(n - 1):
            sum_val += heapq.heappop(queue)
        print("Yes" if heapq.heappop(queue) < sum_val else "No")

if __name__ == "__main__":
    main_obj = Main()
    main_obj.main()

