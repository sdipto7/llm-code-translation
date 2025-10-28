
def main():
    import sys
    data = sys.stdin.read().splitlines()
    n = int(data[0].strip())
    str_val = data[1].strip()
    l = list(str_val)
    x = 0
    y = 0
    t = 0
    
    for i in range(n):
        if l[i] != '4' and l[i] != '7':
            t = 1
    
    if t == 1:
        print("NO")
    else:
        for i in range(n // 2):
            x += int(l[i])
        for i in range(n - 1, (n // 2) - 1, -1):
            y += int(l[i])
        if x == y:
            print("YES")
        else:
            print("NO")

if __name__ == "__main__":
    main()

