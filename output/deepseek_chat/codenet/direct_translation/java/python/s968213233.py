
import sys
import heapq

class Main:
    def __init__(self, in_stream, out_stream, test):
        N = int(in_stream.readline())
        A = list(map(int, in_stream.readline().split()))
        A.sort(reverse=True)
        res = 0
        heap = [(-A[0], -A[0])]
        for a in A[1:]:
            place = heapq.heappop(heap)
            res += min(-place[0], -place[1])
            heapq.heappush(heap, (place[0], -a))
            heapq.heappush(heap, (-a, place[1]))
        print(res)

if __name__ == "__main__":
    in_stream = sys.stdin
    out_stream = sys.stdout
    Main(in_stream, out_stream, 1)

