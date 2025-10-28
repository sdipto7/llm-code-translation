import sys
import heapq

class Main:
    def __init__(self, in_stream, out, test):
        N = int(in_stream.readline())
        A = list(map(int, in_stream.readline().split()))
        A.sort()

        res = 0

        q = []
        heapq.heappush(q, (-A[N - 1], -A[N - 1]))

        for i in range(N - 2, -1, -1):
            a = A[i]
            place = heapq.heappop(q)
            res += min(-place[0], -place[1])
            heapq.heappush(q, (-place[0], -a))
            heapq.heappush(q, (-a, -place[1]))

        out.write(f"{res}\n")

if __name__ == "__main__":
    out = sys.stdout
    in_stream = sys.stdin
    for t in range(1, 2):
        sol = Main(in_stream, out, t)
    out.close()
