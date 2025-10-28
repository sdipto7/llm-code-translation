
import heapq

def main():
    n = int(input())
    queue = []
    for num in map(int, input().split()):
        heapq.heappush(queue, num)
    sum_val = 0
    for _ in range(n - 1):
        sum_val += heapq.heappop(queue)
    print('Yes' if heapq.heappop(queue) < sum_val else 'No')

if __name__ == "__main__":
    main()

