
class Point:
    def __init__(self, name):
        self.name = name
        self.friends = {}

    def becomeFriend(self, p, length):
        self.friends[p] = length

def dfs(p, length):
    if colors[p.name] != -1:
        return
    colors[p.name] = 0 if length % 2 == 0 else 1
    for friend, l in p.friends.items():
        dfs(friend, length + l)

n = int(input())
colors = [-1] * n
points = [Point(i) for i in range(n)]
for _ in range(n - 1):
    u, v, w = map(int, input().split())
    u -= 1
    v -= 1
    points[u].becomeFriend(points[v], w)
    points[v].becomeFriend(points[u], w)

dfs(points[0], 0)

for c in colors:
    print(c)

