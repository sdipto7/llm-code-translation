
import heapq
from collections import defaultdict

n = int(input())
arr = list(map(int, input().split()))
arr.sort(reverse=True)

if n < 3:
    print(arr[0])
else:
    ans = arr[0] + arr[1]
    count_map = defaultdict(int)
    heap = []

    def push_pair(x, y):
        key = (-min(x, y), -x, -y, x, y)
        heapq.heappush(heap, key)

    initial_pairs = [(arr[0], arr[1]), (arr[2], arr[1]), (arr[2], arr[0])]
    for x, y in initial_pairs:
        count_map[(x, y)] += 1
        push_pair(x, y)

    for i in range(3, n):
        current = arr[i]
        while True:
            if not heap:
                break  # Should not occur per problem constraints
            min_neg, x_neg, y_neg, x, y = heapq.heappop(heap)
            pair = (x, y)
            if count_map.get(pair, 0) > 0:
                count_map[pair] -= 1
                if count_map[pair] == 0:
                    del count_map[pair]
                ans += min(x, y)
                for new_pair in [(x, current), (y, current)]:
                    count_map[new_pair] += 1
                    push_pair(*new_pair)
                break
    print(ans)

