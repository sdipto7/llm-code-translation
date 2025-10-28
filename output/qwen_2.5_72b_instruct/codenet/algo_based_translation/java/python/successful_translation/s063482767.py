
import sys
from queue import PriorityQueue

def main():
    input = sys.stdin.read().split()
    n = int(input[0])
    queue = PriorityQueue()
    
    for i in range(1, n + 1):
        queue.put(int(input[i]))
    
    sum = 0
    for i in range(n - 1):
        sum += queue.get()
    
    if queue.get() < sum:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

