
import queue
import sys

def solve():
    sc = sys.stdin.read().split()
    N = int(sc[0])
    arr = list(map(int, sc[1:N+1]))
    sum = 0
    q = queue.PriorityQueue()
    for i in range(N):
        q.put(arr[i])
        if arr[i] <= q.queue[0]:
            sum += 1
    return sum

if __name__ == "__main__":
    print(solve())

