
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    N = int(data[0])
    map = {}
    for i in range(N):
        map[i] = data[i + 1]
    
    ans = True
    past = {}
    next = ""
    
    for i in range(N):
        if map[i] in past.values():
            ans = False
            break
        past[i] = map[i]
        if i != 0:
            if next != map[i][0]:
                ans = False
                break
        next = map[i][-1]
    
    if ans:
        print("Yes")
    else:
        print("No")

main()

