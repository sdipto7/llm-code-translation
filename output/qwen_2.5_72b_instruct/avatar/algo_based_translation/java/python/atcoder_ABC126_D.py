
from collections import defaultdict

class Point:
    def __init__(self, name):
        self.name = name
        self.friends = defaultdict(int)

    def becomeFriend(self, p, length):
        self.friends[p] = length

def dfs(p, length, colors):
    alreadyKnown = colors[p.name] != -1
    if alreadyKnown:
        return
    if length % 2 == 0:
        colors[p.name] = 0
    else:
        colors[p.name] = 1
    for friend, length2 in p.friends.items():
        dfs(friend, length + length2, colors)

def main():
    import sys
    input = sys.stdin.read().split()
    i = 0
    n = int(input[i])
    m = n - 1
    colors = [-1] * n
    points = [Point(i) for i in range(n)]
    i += 1
    while m > 0:
        me = int(input[i]) - 1
        you = int(input[i + 1]) - 1
        length = int(input[i + 2])
        points[me].becomeFriend(points[you], length)
        points[you].becomeFriend(points[me], length)
        i += 3
        m -= 1
    dfs(points[0], 0, colors)
    for c in colors:
        print(c)

if __name__ == "__main__":
    main()

