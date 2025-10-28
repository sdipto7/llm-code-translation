
from collections import defaultdict

class Point:
    def __init__(self, name):
        self.name = name
        self.friends = {}

    def become_friend(self, p, length):
        self.friends[p] = length

def dfs(p, length):
    global colors
    already_known = colors[p.name] != -1
    if already_known:
        return
    if length % 2 == 0:
        colors[p.name] = 0
    else:
        colors[p.name] = 1
    for friend, length2 in p.friends.items():
        dfs(friend, length + length2)

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    idx = 0
    n = int(data[idx])
    idx += 1
    m = n - 1
    global colors
    colors = [-1] * n
    points = [Point(i) for i in range(n)]
    
    while m > 0:
        m -= 1
        me = int(data[idx]) - 1
        idx += 1
        you = int(data[idx]) - 1
        idx += 1
        length = int(data[idx])
        idx += 1
        points[me].become_friend(points[you], length)
        points[you].become_friend(points[me], length)

    dfs(points[0], 0)
    
    for c in colors:
        print(c)

if __name__ == "__main__":
    main()

