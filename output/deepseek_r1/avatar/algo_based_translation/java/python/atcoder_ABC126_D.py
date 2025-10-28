
import sys
from typing import List, Dict

colors: List[int] = []

class Point:
    def __init__(self, name: int):
        self.name = name
        self.friends: Dict[Point, int] = {}
    
    def becomeFriend(self, p: 'Point', length: int) -> None:
        self.friends[p] = length

def dfs(p: Point, length: int) -> None:
    global colors
    if colors[p.name] != -1:
        return
    colors[p.name] = 0 if length % 2 == 0 else 1
    for friend, edge_length in p.friends.items():
        dfs(friend, length + edge_length)

def main() -> None:
    global colors
    n = int(sys.stdin.readline())
    m = n - 1
    colors = [-1] * n
    points = [Point(i) for i in range(n)]
    for _ in range(m):
        u, v, w = map(int, sys.stdin.readline().split())
        me = u - 1
        you = v - 1
        points[me].becomeFriend(points[you], w)
        points[you].becomeFriend(points[me], w)
    dfs(points[0], 0)
    for c in colors:
        print(c)

if __name__ == "__main__":
    main()

