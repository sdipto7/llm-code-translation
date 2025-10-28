
import sys
from collections import defaultdict

def main():
    n = int(sys.stdin.readline())
    m = n - 1
    colors = [-1] * n
    points = [Point(i) for i in range(n)]
    for _ in range(m):
        me, you, length = map(int, sys.stdin.readline().split())
        me -= 1
        you -= 1
        points[me].becomeFriend(points[you], length)
        points[you].becomeFriend(points[me], length)
    dfs(points[0], 0, colors)
    for c in colors:
        print(c)

def dfs(p, length, colors):
    if colors[p.name] != -1:
        return
    colors[p.name] = 0 if length % 2 == 0 else 1
    for friend, length2 in p.friends.items():
        dfs(friend, length + length2, colors)

class Point:
    def __init__(self, name):
        self.name = name
        self.friends = {}

    def becomeFriend(self, p, length):
        self.friends[p] = length

if __name__ == "__main__":
    main()

