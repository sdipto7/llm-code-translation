
import sys
import math

ans = 0
balls = []
N = 0

def main():
    global ans, balls, N
    data = sys.stdin.read().split()
    ptr = 0
    N = int(data[ptr])
    ptr += 1
    ans = N
    balls = []
    for _ in range(N):
        x = int(data[ptr])
        y = int(data[ptr+1])
        balls.append([x, y])
        ptr +=2
    
    balls.sort(key=lambda x: x[0])
    solve()
    
    swapped = []
    for b in balls:
        swapped.append([b[1], b[0]])
    balls = swapped
    balls.sort(key=lambda x: x[0])
    solve()
    
    print(ans)

def solve():
    global ans
    for add in range(1, N):
        taken = [False]*N
        p = balls[add][0] - balls[0][0]
        q = balls[add][1] - balls[0][1]
        current = check(p, q, taken)
        ans = min(ans, current)

def check(p, q, taken):
    ret = 0
    while True:
        added = False
        start = -1
        x_next = -1
        y_next = -1
        for i in range(N):
            if not taken[i]:
                taken[i] = True
                ret +=1
                start = i
                x_next = balls[i][0] + p
                y_next = balls[i][1] + q
                added = True
                break
        if not added:
            break
        for i in range(start+1, N):
            if balls[i][0] == x_next and balls[i][1] == y_next:
                taken[i] = True
                x_next += p
                y_next += q
    return ret

if __name__ == "__main__":
    main()

