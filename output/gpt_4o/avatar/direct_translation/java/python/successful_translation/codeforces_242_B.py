
INF = int(1e9) + 5

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    a = []
    b = []
    left = INF
    right = 0
    
    index = 1
    for i in range(n):
        a_i = int(data[index])
        b_i = int(data[index + 1])
        a.append(a_i)
        b.append(b_i)
        left = min(left, a_i)
        right = max(right, b_i)
        index += 2

    for i in range(n):
        if left == a[i] and right == b[i]:
            print(i + 1)
            return

    print(-1)

main()

